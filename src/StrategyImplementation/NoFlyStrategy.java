package StrategyImplementation;

import StrategyInterface.IFlyStrategy;

public class NoFlyStrategy implements IFlyStrategy {
    public void run() {
        System.out.println("I cannot fly!");
    }
}
