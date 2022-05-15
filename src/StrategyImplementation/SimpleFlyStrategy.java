package StrategyImplementation;

import StrategyInterface.IFlyStrategy;

public class SimpleFlyStrategy implements IFlyStrategy {
    public void run() {
        System.out.println("I'm flying.");
    }
}
