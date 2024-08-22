package LearningSpringBoot.backstone.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    // Spring에서 Bean을 구현할 시 중복된 Component를 발견할 시 처리하는 방법 1
public class BurgerSet implements servingFood {
    @Override
    public void cooking() {
        System.out.println("pile the ingredient");
    }

    @Override
    public void takeItToTable() {
        System.out.println("serving a burger with coke and fried chips");
    }

    @Override
    public void payment() {
        System.out.println("total = 10$");
    }

    @Override
    public int income() {
        return 10;
    }
}
