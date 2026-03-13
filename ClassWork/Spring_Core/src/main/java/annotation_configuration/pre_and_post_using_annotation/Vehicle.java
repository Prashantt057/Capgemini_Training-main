package annotation_configuration.pre_and_post_using_annotation;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle()");

    }
    @PostConstruct
    public void moving(){
        System.out.println("Vehicle is moving");
    }

    @PreDestroy
    public void accident(){
        System.out.println("Thank god , No lives lost");
    }

}
