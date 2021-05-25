package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Rating;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {
    Rating findByTconst(String tconst);
    List<Rating> findAllByAverageRatingEquals(Double averageRating);
}
