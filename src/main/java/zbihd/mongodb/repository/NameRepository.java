package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Name;

public interface NameRepository extends MongoRepository<Name, String> {
}
