package LearningSpringBoot.backstone.animals;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements GamingConsole {
    public void see(){
        System.out.println("See the tiger's teeth");
    }
    public void feed(){
        System.out.println("Feed meats to the tiger");
    }
    public void touch(){
        System.out.println("Touch the tiger's feet");
    }
}
