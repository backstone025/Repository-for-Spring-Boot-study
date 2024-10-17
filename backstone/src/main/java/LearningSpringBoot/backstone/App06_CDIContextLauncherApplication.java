package LearningSpringBoot.backstone;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessService{
    private Dataservice dataservice;

    //@Autowired
    @Inject
    public void setDataservice(Dataservice dataservice) {
        this.dataservice = dataservice;
        System.out.println("setter injection");
    }

    public Dataservice getDataservice() {
        return dataservice;
    }
}

//@Component
@Named
class Dataservice{

}

@Configuration
@ComponentScan
public class App06_CDIContextLauncherApplication {
    public static void main(String[] arg){

        try (var context = new AnnotationConfigApplicationContext(App06_CDIContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataservice());
        }
    }
}
