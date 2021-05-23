package zbihd.mongodb.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import zbihd.mongodb.model.Title;

import java.util.List;
import java.util.Optional;

public interface TitleRepository extends MongoRepository<Title, String> {
    Optional<Title> findByTconst(String tconst);

    @Query(value = "{ 'startYear': ?0, 'genres': {$regex : ?1 }, 'runtimeMinutes': {$gt: ?2, $lte: ?3 } }",
            sort = "{ 'primaryTitle': 1 }")
    List<Title> findByStartYearAndGenreAndRuntimeMinutesBetweenOrderByPrimaryTitleAsc(Integer startYear, String genre, Integer from, Integer to, Pageable pageable);

    @Query(value = "{ 'startYear': ?0, 'genres': {$regex : ?1 }, runtimeMinutes: {$ne: ?2 } }",
          sort = "{ 'runtimeMinutes': -1 }")
    List<Title> findByStartYearAndGenreDesc(Integer startYear, String genre, String runtimeValidation, Pageable pageable);

    List<Title> findByPrimaryTitleAndStartYear(String primaryTitle, Integer startYear);
}
