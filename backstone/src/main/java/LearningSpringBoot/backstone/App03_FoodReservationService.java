package LearningSpringBoot.backstone;

import LearningSpringBoot.backstone.food.Manual;
import LearningSpringBoot.backstone.food.servingFood;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("LearningSpringBoot.backstone.food")
public class App03_FoodReservationService {

    @Bean
    public Manual Restaurant(servingFood manual) {
        System.out.println("parameter : " + manual);
        var restaurant = new Manual(manual);
        return restaurant;
    }

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(App03_FoodReservationService.class)) {
            context.getBean(Manual.class).work();
        }
    }
}
