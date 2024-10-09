package LearningSpringBoot.backstone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
class ClassA{
}

@Component
@Lazy
class ClassB{
    ClassA A;

    public ClassB(ClassA A) {
        System.out.println("some Initialization logic");
        this.A = A;
    }

    public void doSomething(){
        System.out.println("class B do somthing");
    }
}

@Configuration
@ComponentScan
public class App05_LazyInitializationExample {
    public static void main(String[] arg) {
        try(var context = new AnnotationConfigApplicationContext(App05_LazyInitializationExample.class)){
            Scanner sc = new Scanner(System.in);
            sc.nextLine();

            context.getBean(ClassB.class).doSomething();
        }
    }
}
