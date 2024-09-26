package LearningSpringBoot.backstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// field dependency injection
@Component
class YouBusinessClass{
    @Autowired
    dependency1 dependency1;
    @Autowired
    dependency2 dependency2;
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Using").append(dependency1).append("and").append(dependency2);
        return sb.toString();
    }
}

@Component
class dependency1{

}

@Component
class dependency2{

}

@Configuration
@ComponentScan
// 특정 주소를 지목하지 않을 경우, scan하는 대상은 현재 해당 class가 속해있는 package이다.
public class App04_DepInjectionLauncherApplication {
    public static void main(String arg[]){
        try(var context = new AnnotationConfigApplicationContext(App04_DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YouBusinessClass.class));
        }
    }
}
