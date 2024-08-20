package LearningSpringBoot.backstone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {
}

record Clone(String name, int age, Address address) {
}

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
    @Primary // Person 유형의 Beans 중 해당 Bean을 기본으로 설정한다.
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
    public Clone clone() {
        return new Clone("Ravi", 20, new Address("Main Street", "Main City"));
    }

    @Bean
    @Qualifier("person3qualifier") // 한정자를 이용하는 방법
    public Person person3Parameters(String name, int age) {
        return new Person(name, age);
    }

    @Bean
    public Clone clone2(String name, int age, @Qualifier("address2") Address address) {
        return new Clone(name, age, address);
    }

    // Bean에 사용자 지정 이름을 부여한다.
    @Bean(name = "address1")
    @Primary
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    @Qualifier("address2")
    public Address address2() {
        return new Address("coffee Street", "seoul");
    }
}
