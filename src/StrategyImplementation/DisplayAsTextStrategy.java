package StrategyImplementation;

import StrategyInterface.IDisplayStrategy;

public class DisplayAsTextStrategy implements IDisplayStrategy {
    public void run() {
        System.out.println("I'm in the screen!");
    }
}
