package com.learnspring.learnspring.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}
record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Paccy";
    }

    @Bean
    public int age() {
        return 15;
    }
    @Bean
    public Person person() {
        return new Person("Paccy", 20);
    }
    @Bean
    public Address address() {
        return new Address("Kicukiro", "Kigali");
    }
    @Bean
    public Address address2() {
        return new Address("Kagarama", "Kigali");
    }
}
