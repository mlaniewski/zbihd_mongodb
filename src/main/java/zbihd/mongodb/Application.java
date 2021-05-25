package zbihd.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zbihd.mongodb.zadania.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private Zadanie2 zadanie2;

    @Autowired
    private Zadanie3 zadanie3;

    @Autowired
    private Zadanie4 zadanie4;

    @Autowired
    private Zadanie5 zadanie5;

    @Autowired
    private Zadanie6 zadanie6;

    @Autowired
    private Zadanie7 zadanie7;

    @Autowired
    private Zadanie8 zadanie8;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //zadanie2.perform();
        //zadanie3.perform();
        //zadanie4.perform();
        //zadanie5.perform();
        //zadanie6.perform();
        //zadanie7.perform();
        zadanie8.perform();
    }
}
