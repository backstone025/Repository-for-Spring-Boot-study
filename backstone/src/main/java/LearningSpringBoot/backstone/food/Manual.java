package LearningSpringBoot.backstone.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manual {
    private servingFood manual;

    // 한정자를 통해 우선권을 부여할 때 생성자 주입(constructor injection)을 통해 autowiring을 할 수 있다.
    public Manual(@Qualifier("FriedChickenQualifier") servingFood manual) {
        this.manual = manual;
    }

    public int work() {
        System.out.println("order : " + manual);
        manual.cooking();
        manual.takeItToTable();
        manual.payment();
        return manual.income();
    }
}
