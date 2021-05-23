package zbihd.mongodb.zadania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import zbihd.mongodb.model.Cast;
import zbihd.mongodb.model.Name;
import zbihd.mongodb.model.Title;
import zbihd.mongodb.repository.CastRepository;
import zbihd.mongodb.repository.NameRepository;
import zbihd.mongodb.repository.TitleRepository;

import java.util.List;
import java.util.Optional;

@Component
public class Zadanie5 {

    @Autowired
    private TitleRepository titleRepository;

    @Autowired
    private NameRepository nameRepository;

    @Autowired
    private CastRepository castRepository;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 5 --------------------------------");
        System.out.println("------------------------------------------------------------------");
        List<Title> casablanca = titleRepository.findByPrimaryTitleAndStartYear("Casablanca", 1942);
        for (Title title: casablanca) {
            List<Cast> castOfCasablanca = castRepository.findByTconstAndCategory(title.getTconst(), "director");
            for (Cast cast: castOfCasablanca) {
                Optional<Name> director = nameRepository.findByNconst(cast.getNconst());
                System.out.println(director.get().getPrimaryName() + " " + director.get().getBirthYear());
            }
        }

        System.out.println("------------------------------------------------------------------");
    }
}
