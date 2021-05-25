package zbihd.mongodb.zadania;

import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import zbihd.mongodb.model.Rating;
import zbihd.mongodb.model.Title;
import zbihd.mongodb.repository.RatingRepository;

import java.util.List;

@Component
public class Zadanie8 {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private RatingRepository ratingRepository;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 8 --------------------------------");
        System.out.println("------------------------------------------------------------------");

        List<Rating> topRatings =  ratingRepository.findAllByAverageRatingEquals(10.0);
        Update u = Update.update("max", 1);
        for (Rating rating: topRatings) {
            Title result = mongoTemplate.findAndModify(new Query(Criteria.where("tconst").is(rating.getTconst())), u, Title.class);
            //System.out.println(result);
        }

        System.out.println("------------------------------------------------------------------");
    }
}
