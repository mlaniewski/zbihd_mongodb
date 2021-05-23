package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Name;
import zbihd.mongodb.model.Title;

import java.util.Optional;

public interface NameRepository extends MongoRepository<Name, String> {
    Optional<Name> findByNconst(String nconst);
}
