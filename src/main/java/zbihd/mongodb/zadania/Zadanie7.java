package zbihd.mongodb.zadania;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

@Component
public class Zadanie7 {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 7 --------------------------------");
        System.out.println("------------------------------------------------------------------");

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.lookup("Rating", "tconst", "tconst", "rating"),
                Aggregation.match(Criteria
                        .where("startYear").gte(1994).lte(1996)),
                Aggregation.sort(Sort.Direction.DESC, "averageRating"),
                Aggregation.limit(5));

        AggregationResults<Document> result = mongoTemplate.aggregate(aggregation, "Title", Document.class);

        result.getMappedResults().forEach(System.out::println);

        System.out.println("------------------------------------------------------------------");
    }
}
