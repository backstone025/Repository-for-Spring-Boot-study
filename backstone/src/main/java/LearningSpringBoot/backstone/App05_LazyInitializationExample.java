package LearningSpringBoot.backstone;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
    private ClassB B;

    public ClassA(ClassB B) {
        super();
        this.B = B;
        System.out.println("All dependency is ready.");
    }

    // @PostConstruct -> 해당 method가 initialization을 위해 의존성 주입을 마친 후 실행하도록 한다.
    @PostConstruct
    public void initialize(){
        B.ready();
    }

    // @PreDestroy -> container에 의해 process가 삭제되기 전, 해당 instance를 callback한다.
    @PreDestroy
    public void cleanup(){
        System.out.println("clean up.");
    }
}

@Component
class ClassB {
    public void ready() {
        System.out.println("Some logic using");
    }
}

@Configuration
@ComponentScan
public class App05_LazyInitializationExample {
    public static void main(String[] arg) {
        try (var context = new AnnotationConfigApplicationContext(App05_LazyInitializationExample.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
