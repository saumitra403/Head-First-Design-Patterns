package stratergypattern;


/*The Strategy Pattern defines a family of algorithms, encapsulates each one and makes them interchangeable. It lets the algorithm vary
depending on the client that's using it. */
public abstract class Duck {
    private FlyingBehaviour flyingBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void performFly() {
        flyingBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return flyingBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
