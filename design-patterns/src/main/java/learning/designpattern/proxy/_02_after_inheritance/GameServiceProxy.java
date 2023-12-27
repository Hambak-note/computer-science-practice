package learning.designpattern.proxy._02_after_inheritance;

import learning.designpattern.proxy._01_before.GameService;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
