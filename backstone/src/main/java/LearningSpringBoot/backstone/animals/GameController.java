package LearningSpringBoot.backstone.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class GameController {
    private GamingConsole animal;

    public GameController(GamingConsole animal) {
        this.animal = animal;
    }

    @Bean
    public void run() {
        System.out.println("meeting animal : " + animal);
        animal.see();
        animal.feed();
        animal.touch();
    }
}
