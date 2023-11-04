package stratergypattern;

public class MallardDuck extends Duck{
    public MallardDuck() {
        setQuackBehaviour(new Quack());
        setFlyingBehaviour(new FlyWithWings());
    }
}
