package zbihd.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zbihd.mongodb.zadania.Zadanie2;
import zbihd.mongodb.zadania.Zadanie3;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private Zadanie2 zadanie2;

    @Autowired
    private Zadanie3 zadanie3;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //zadanie2.perform();
        zadanie3.perform();
    }
}
