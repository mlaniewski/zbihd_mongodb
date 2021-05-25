package zbihd.mongodb.zadania;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;

@Component
public class Zadanie7 {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 7 --------------------------------");
        System.out.println("------------------------------------------------------------------");

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria
                        .where("startYear").gte(1994).lte(1996).and("genres").regex(".*Documentary.*")),
                Aggregation.lookup("Rating", "tconst", "tconst", "ratings"),
                //Aggregation.sort(Sort.Direction.DESC, "ratings.averageRating"),
                Aggregation.limit(5)
        );

        AggregationResults<Document> result = mongoTemplate.aggregate(aggregation, "Title", Document.class);

        result.getMappedResults().forEach(System.out::println);
        //System.out.println(result.getMappedResults().size());

        System.out.println("------------------------------------------------------------------");
    }
}
