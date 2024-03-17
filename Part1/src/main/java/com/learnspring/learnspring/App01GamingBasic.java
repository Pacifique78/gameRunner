package com.learnspring.learnspring;

import com.learnspring.learnspring.game.GameRunner;
import com.learnspring.learnspring.game.MarioGame;
import com.learnspring.learnspring.game.PackManGame;
import com.learnspring.learnspring.game.SupperContraGame;

public class App01GamingBasic {

    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SupperContraGame();
        var game = new PackManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
