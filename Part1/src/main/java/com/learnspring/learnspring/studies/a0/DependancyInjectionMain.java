package com.learnspring.learnspring.studies.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learnspring.learnspring.studies.a0")
public class DependancyInjectionMain {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependancyInjectionMain.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
