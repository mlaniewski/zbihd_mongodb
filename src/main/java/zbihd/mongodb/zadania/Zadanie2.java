package zbihd.mongodb.zadania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zbihd.mongodb.repository.*;

@Component
public class Zadanie2 {
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


    public void perform() {
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
