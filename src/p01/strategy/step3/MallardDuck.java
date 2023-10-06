package p01.strategy.step3;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    void display() {
        System.out.println("display MallardDuck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
