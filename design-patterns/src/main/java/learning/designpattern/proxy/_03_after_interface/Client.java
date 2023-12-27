package learning.designpattern.proxy._03_after_interface;

public class Client {

    public static void main(String[] args) {

        GameServiceProxy gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }
}
