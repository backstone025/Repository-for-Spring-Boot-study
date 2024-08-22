package LearningSpringBoot.backstone.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FriedChickenQualifier") // Spring에서 Bean을 구현할 시 중복된 Component를 발견할 시 처리하는 방법 2
public class FriedChicken implements servingFood {
    @Override
    public void cooking() {
        System.out.println("fry the chicken");
    }

    @Override
    public void takeItToTable() {
        System.out.println("Serve the chicken with coke and radish pickle");
    }

    @Override
    public void payment() {
        System.out.println("total = 16$");
    }

    @Override
    public int income() {
        return 16;
    }
}
