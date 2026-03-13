package primary_qualifier.entity;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("Bike Running...");
    }
}
