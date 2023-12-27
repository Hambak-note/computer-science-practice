package learning.designpattern.proxy._02_after_inheritance;

import learning.designpattern.proxy._01_before.GameService;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
