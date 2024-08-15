package LearningSpringBoot.backstone;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App02_HelloWorldSpring {
    public static void main(String arg[]){
        // 1. Spring Context 시작하기
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. 우리가 원하는 것들을 Spring이 관리하게 하기
        // HelloWorldConfiguration Spring Context 생성 - @Configuration
        // name object를 Spring이 관리하도록 한다. - @Bean

        // 3. Spring에 의해 관리되는 Beans을 끌어내기
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));
    }
}
