package zbihd.mongodb.zadania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import zbihd.mongodb.model.Title;
import zbihd.mongodb.repository.TitleRepository;

import java.util.List;

@Component
public class Zadanie4 {

    @Autowired
    private TitleRepository titleRepository;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 4 --------------------------------");
        System.out.println("------------------------------------------------------------------");
        List<Title> titleList = titleRepository.findByStartYearAndGenreDesc(
                1925,
                "Comedy",
                "\\N",
                PageRequest.of(1, 20));
        System.out.println("------------------------------------------------------------------");

        for (Title title : titleList) {
            System.out.println("oryginalny tytuł: " + title.getOriginalTitle() + ", czas trwania:" + title.getRuntimeMinutes() + ", kategoria:" + title.getGenres());
        }

        System.out.println("------------------------------------------------------------------");
        List<Title> titleListFull = titleRepository.findByStartYearAndGenreDesc(
                1925,
                "Comedy",
                "\\N",
                null);
        System.out.println(titleListFull.size());
        System.out.println("------------------------------------------------------------------");
    }
}
