package zbihd.mongodb.zadania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import zbihd.mongodb.model.Title;
import zbihd.mongodb.repository.TitleRepository;

import java.util.List;

@Component
public class Zadanie3 {

    @Autowired
    private TitleRepository titleRepository;

    public void perform() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("----------------------- Zadanie 3 --------------------------------");
        System.out.println("------------------------------------------------------------------");
        List<Title> titleList = titleRepository.findByStartYearAndGenreAndRuntimeMinutesBetweenOrderByPrimaryTitleAsc(
                2005,
                "Romance",
                100,
                120,
                PageRequest.of(1, 5));
        System.out.println("------------------------------------------------------------------");

        for (Title title : titleList) {
            System.out.println("tytuł: " + title.getPrimaryTitle() + ", rok produkcji:" + title.getStartYear() + ", kategoria:" + title.getGenres() + ", czas trwania:" + title.getRuntimeMinutes());
        }

        System.out.println("------------------------------------------------------------------");
        List<Title> allTitles = titleRepository.findByStartYearAndGenreAndRuntimeMinutesBetweenOrderByPrimaryTitleAsc(
                2005,
                "Romance",
                100,
                120,
                null);
        System.out.println(allTitles.size());
        System.out.println("------------------------------------------------------------------");
    }
}
