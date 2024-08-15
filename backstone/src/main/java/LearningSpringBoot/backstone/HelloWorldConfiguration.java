package LearningSpringBoot.backstone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Backstone";
    }

    @Bean
    public int age() {
        return 23;
    }
    @Bean
    public Person person(){
        return new Person("Ravi", 20);
    }

}
