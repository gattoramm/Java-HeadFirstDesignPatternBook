package p01.strategy.step3;

public class RubberDuck extends Duck implements Quackable{
    @Override
    void display() {
        System.out.println("display RubberDuck");
    }

    @Override
    public void quack() {

    }
}
