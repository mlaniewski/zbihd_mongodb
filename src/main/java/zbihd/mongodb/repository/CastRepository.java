package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Cast;
import zbihd.mongodb.model.Name;

public interface CastRepository extends MongoRepository<Cast, String> {
}
