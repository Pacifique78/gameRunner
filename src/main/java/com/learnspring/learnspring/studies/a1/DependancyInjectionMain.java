package com.learnspring.learnspring.studies.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependancyInjectionMain {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependancyInjectionMain.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
