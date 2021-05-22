package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Crew;
import zbihd.mongodb.model.Name;

public interface CrewRepository extends MongoRepository<Crew, String> {
}
