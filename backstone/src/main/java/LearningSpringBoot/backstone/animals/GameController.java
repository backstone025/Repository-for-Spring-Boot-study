package LearningSpringBoot.backstone.animals;

public class GameController {
    private Elephant animal;

    public GameController(Elephant animal) {
        this.animal = animal;
    }

    public void run() {
        System.out.println("meeting animal : " + animal);
        animal.see();
        animal.feed();
        animal.touch();
    }
}
