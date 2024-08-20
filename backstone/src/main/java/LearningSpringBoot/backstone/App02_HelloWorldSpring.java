package LearningSpringBoot.backstone;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.Arrays;

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

        // Bean에 사용자 지정 이름을 붙여주어 호출하기
        System.out.println(context.getBean("address1"));

        // Bean의 유형을 매개변수로 사용하여 Bean 호출하기
        System.out.println(context.getBean(Address.class));

        // Bean끼리 종속성을 갖도록 만들기
        // 1. method 호출
        System.out.println(context.getBean("person2MethodCall"));

        // 2. record 객체에 종속시키기
        System.out.println(context.getBean("clone"));

        // 3. parameter로 다른 class로부터 가져와오기
        System.out.println(context.getBean("person3Parameters"));

        // 문제점 : Bean의 유셩을 매개변수로 사용하여 호출할 시, 만일 같은 유형의 Beans이 여러개 있으면, 여러 개의 Bean이 발견되었다는 예회를 출력한다.
        // 해결 : 1. Beam 후보들 중 하나를 기본으로 설정한다. 2. 한정자를 이용한다.
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("clone2"));

        // Spring이 관리하는 모든 Beans의 이름들을 나열하기
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBeanDefinitionCount());
    }
}