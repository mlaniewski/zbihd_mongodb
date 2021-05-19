package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
    Rating findByTconst(String tconst);
}
