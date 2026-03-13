package primary_qualifier.configuraton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

////@PropertySource(value = "classpath:di.property")
@Configuration
@ComponentScan(basePackages = "primary_qualifier")
public class AppConfig {

}
