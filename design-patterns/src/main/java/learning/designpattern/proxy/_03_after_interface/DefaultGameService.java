package learning.designpattern.proxy._03_after_interface;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() {
        System.out.println("인터페이스 기반 프록시 패턴 테스트용 메서드");
    }
}
