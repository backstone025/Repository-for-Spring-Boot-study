package LearningSpringBoot.backstone;

import LearningSpringBoot.backstone.animals.*;

public class App01_PlayZooGame {
    private GameController gameController;
    public App01_PlayZooGame(GameController gameController) {
        this.gameController = gameController;
    }

    public void controller(GamingConsole animal){
        gameController.run();
    }
}
