package com.learnspring.learnspring.studies.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDIMain {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(CDIMain.class)) {
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
