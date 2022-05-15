package StrategyImplementation;

import StrategyInterface.IQuackStrategy;

public class SimpleQuackStrategy implements IQuackStrategy {
    public void run() {
        System.out.println("Quack!");
    }
}
