package StrategyImplementation;

import StrategyInterface.IQuackStrategy;

public class AnnoyingQuackStrategy implements IQuackStrategy {
    public void run() {
        for (int i = 0 ; i < 10; i++) System.out.print("QUACK ");
        System.out.println();
    }
}
