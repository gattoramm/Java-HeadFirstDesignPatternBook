package p01.strategy.step3;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    void display() {
        System.out.println("display RedheadDuck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
