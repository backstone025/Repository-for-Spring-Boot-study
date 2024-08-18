package LearningSpringBoot.backstone;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Clone(String name, int age, Address address){}

record Address(String firstLine, String city) {
}

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
    public Person person() {
        return new Person("Ravi", 20);
    }

    // method 호출로 class 상호 간에 종속되도록 하기
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    // recod 객체에 parameter로 다른 record 객체를 넣어 종속되게 하기
    @Bean
    public Clone clone(){
        return new Clone("Ravi", 20, new Address("Main Street", "Main City"));
    }

    @Bean
    public Person person3Parameters(String name, int age){
        return new Person(name, age);
    }

    // Bean에 사용자 지정 이름을 부여한다.
    @Bean(name = "address1")
    public Address address(){
        return new Address("Baker Street", "London");
    }
}
