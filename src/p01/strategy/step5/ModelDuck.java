package p01.strategy.step5;


public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
