package LearningSpringBoot.backstone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App07_XmlConfigurationContextLauncherApplication {
    public static void main(String[] args){
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
        }
    }
}
