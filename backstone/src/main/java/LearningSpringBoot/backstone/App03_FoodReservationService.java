package LearningSpringBoot.backstone;

import LearningSpringBoot.backstone.food.BurgerSet;
import LearningSpringBoot.backstone.food.FriedChicken;
import LearningSpringBoot.backstone.food.Manual;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class App03_FoodReservationService {
    @Bean
    @Primary
    public Manual MainRestaurant() {
        return new Manual(new BurgerSet());
    }

    @Bean
    public Manual BranchRestaurant() {
        return new Manual(new FriedChicken());
    }

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(App03_FoodReservationService.class)) {
            System.out.println(context.getBean("MainRestaurant"));
            context.getBean(Manual.class).work();
            ((Manual) context.getBean("BranchRestaurant")).work(); // 해당 방식은 Object type으로 가져오기 때문에 Bean의 함수 사용 불가
        }
    }
}
