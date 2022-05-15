import StrategyInterface.IDisplayStrategy;
import StrategyInterface.IFlyStrategy;
import StrategyInterface.IQuackStrategy;

/**
 * The client class.
 */
public class Duck {
    IFlyStrategy flyStrategy;
    IQuackStrategy quackStrategy;
    IDisplayStrategy displayStrategy;

    public Duck(IFlyStrategy flyStrategy, IQuackStrategy quackStrategy, IDisplayStrategy displayStrategy) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
        this.displayStrategy = displayStrategy;
    }

    public void fly() {
        flyStrategy.run();
    }

    public void quack() {
        quackStrategy.run();
    }

    public void display() {
        displayStrategy.run();
    }
}
