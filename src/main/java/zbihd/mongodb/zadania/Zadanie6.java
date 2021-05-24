package zbihd.mongodb.zadania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;
import zbihd.mongodb.model.result.Zadanie6Result;

@Component
public class Zadanie6 {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 6 --------------------------------");
        System.out.println("------------------------------------------------------------------");

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("startYear").is(2009)),
                Aggregation.group("titleType").count().as("totalNumberOfFilms"));

        AggregationResults<Zadanie6Result> result = mongoTemplate.aggregate(aggregation, "Title", Zadanie6Result.class);

        result.getMappedResults().forEach(System.out::println);

        System.out.println("------------------------------------------------------------------");
    }
}
