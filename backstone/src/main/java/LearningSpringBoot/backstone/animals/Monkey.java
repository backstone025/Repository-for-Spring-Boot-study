package LearningSpringBoot.backstone.animals;

import org.springframework.stereotype.Component;

@Component
public class Monkey implements GamingConsole {
    public void see(){
        System.out.println("See the monkey's face");
    }
    public void feed(){
        System.out.println("Feed fruits to the elephant");
    }
    public void touch(){
        System.out.println("Touch the monkey's tail");
    }
}
