package zbihd.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zbihd.mongodb.model.Name;
import zbihd.mongodb.model.Rating;
import zbihd.mongodb.model.Title;
import zbihd.mongodb.repository.*;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CastRepository castRepository;
    @Autowired
    private CrewRepository crewRepository;
    @Autowired
    private NameRepository nameRepository;
    @Autowired
    private RatingRepository ratingRepository;
    @Autowired
    private TitleRepository titleRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 2 --------------------------------");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cast records found:");
        System.out.println(castRepository.count());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Crew  records found:");
        System.out.println(crewRepository.count());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Name records found:");
        System.out.println(nameRepository.count());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Rating records found:");
        System.out.println(ratingRepository.count());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Title records found:");
        System.out.println(titleRepository.count());
        System.out.println("------------------------------------------------------------------");
    }
}
