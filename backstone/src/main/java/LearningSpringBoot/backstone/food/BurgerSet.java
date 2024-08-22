package LearningSpringBoot.backstone.food;

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
