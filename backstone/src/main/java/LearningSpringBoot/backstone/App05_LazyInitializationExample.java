package LearningSpringBoot.backstone;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Scanner;

@Component
class ClassA{
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ClassB{

}

@Configuration
@ComponentScan
public class App05_LazyInitializationExample {
    public static void main(String[] arg) {
        try(var context = new AnnotationConfigApplicationContext(App05_LazyInitializationExample.class)){
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));

            System.out.println(context.getBean(ClassA.class));
            System.out.println(context.getBean(ClassA.class));
            System.out.println(context.getBean(ClassA.class));
        }
    }
}
