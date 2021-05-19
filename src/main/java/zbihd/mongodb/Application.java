package zbihd.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zbihd.mongodb.model.Rating;
import zbihd.mongodb.repository.RatingRepository;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private RatingRepository ratingRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ratings found with findAll():");
        List<Rating> ratingCollection = ratingRepository.findAll();
        System.out.println(ratingCollection.get(0));
        System.out.println();

        System.out.println(ratingRepository.findByTconst("tt0000002"));

    }
}
