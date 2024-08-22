package LearningSpringBoot.backstone.food;

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
