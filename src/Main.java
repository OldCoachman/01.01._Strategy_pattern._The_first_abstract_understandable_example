import StrategyImplementation.DisplayAsGraphicsStrategy;
import StrategyImplementation.NoFlyStrategy;
import StrategyImplementation.SimpleQuackStrategy;

public class Main {

    public static void main(String[] args) {

        // Insert strategies we need. For example, let our duck is city duck.
        // Assume, the properties are:
        // - our duck can fly
        // - simple quacks
        // - a duck is represented as a picture
        Duck cityDuck = new Duck(new NoFlyStrategy(), new SimpleQuackStrategy(), new DisplayAsGraphicsStrategy());

        cityDuck.quack();
        cityDuck.fly();
        cityDuck.display();
    }
}
