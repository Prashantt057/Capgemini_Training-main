package bin_annotation.configuration;

import bin_annotation.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Configuration
public class AppConfig {
    @Bean(name = "getStudent")
    public student getStudent(){return new Student();}

    @Bean(name = "getScanner")
    public Scanner getScanner(){return new Scanner(System.in);}
}
