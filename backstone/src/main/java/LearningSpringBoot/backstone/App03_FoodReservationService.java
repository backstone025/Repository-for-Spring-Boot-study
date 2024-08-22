package LearningSpringBoot.backstone;

import LearningSpringBoot.backstone.food.Manual;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("LearningSpringBoot.backstone.food")
public class App03_FoodReservationService {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(App03_FoodReservationService.class)) {
            context.getBean(Manual.class).work();
        }
    }
}
