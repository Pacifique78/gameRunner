package com.learnspring.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class PackManGame implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Down");
    }

    public void left() {
        System.out.println("Left");
    }

    public void right() {
        System.out.println("Right");
    }
}
