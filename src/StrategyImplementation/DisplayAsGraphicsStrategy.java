package StrategyImplementation;

import StrategyInterface.IDisplayStrategy;

public class DisplayAsGraphicsStrategy implements IDisplayStrategy {

    /**
     * The duck looks to the right (if the picture is confusing) :)
     */
    public void run() {
        System.out.println("          ******");
        System.out.println("        ******  **");
        System.out.println("        **************");
        System.out.println("**      ************");
        System.out.println("****      ******");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("  ****************");
        System.out.println("      **      **");
        System.out.println("    ******  ******");
    }
}

