package LearningSpringBoot.backstone.food;

import org.springframework.stereotype.Component;

@Component
public class Manual {
    private servingFood manual;

    public Manual(servingFood manual) {
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
