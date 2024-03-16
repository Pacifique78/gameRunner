package com.learnspring.learnspring.studies.a3;

import java.util.Arrays;
import com.learnspring.learnspring.game.GameRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationMain {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();
        }
    }
}
