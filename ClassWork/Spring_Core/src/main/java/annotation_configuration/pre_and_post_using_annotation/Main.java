package annotation_configuration.pre_and_post_using_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        ((AbstractApplicationContext)context).close();
    }
}
