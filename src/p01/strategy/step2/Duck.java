package p01.strategy.step2;

public abstract class Duck {
    void quack() {
        System.out.println("quack");
    }

    void swim() {
        System.out.println("swim");
    }

    void fly() {
        System.out.println("fly");
    }

    abstract void display();
}
