package com.learnspring.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnspring.learnspring.game.GameRunner;

@Configuration
@ComponentScan("com.learnspring.learnspring.game")
public class GamingAppLauncher {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
