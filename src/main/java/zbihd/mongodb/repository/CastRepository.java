package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Cast;
import zbihd.mongodb.model.Name;
import zbihd.mongodb.model.Title;

import java.util.List;
import java.util.Optional;

public interface CastRepository extends MongoRepository<Cast, String> {
    List<Cast> findByTconstAndCategory(String tconst, String category);
}
