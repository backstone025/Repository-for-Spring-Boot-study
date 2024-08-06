package LearningSpringBoot.backstone;

import LearningSpringBoot.backstone.animals.Elephant;
import LearningSpringBoot.backstone.animals.GameController;
import LearningSpringBoot.backstone.animals.Monkey;
import LearningSpringBoot.backstone.animals.Tiger;

public class PlayZooGame {
    public static void main(String arg[]){
        var elephant = new Elephant();
        var monkey = new Monkey();
        var tiger = new Tiger();

        var gameController = new GameController(elephant);
        gameController.run();
    }
}
