package primary_qualifier.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Car implements Vehicle {
    @Override
    public void start(){
        System.out.println("Car Running");
    }
}
