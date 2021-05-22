package zbihd.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zbihd.mongodb.model.Name;
import zbihd.mongodb.model.Title;

public interface TitleRepository extends MongoRepository<Title, String> {
}
