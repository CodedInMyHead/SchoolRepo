package random;

import common.HelperClass;
import common.InputType;

import java.util.Scanner;

public class Fibonacci {




    public static void main(String[] args) {

        System.out.print("Bitte geben sie die nte Zahl ein, die sie aus der Fibonacci Sequenz haben wollen: ");

        final Scanner scanner = new Scanner(System.in);
        final int targetNumber = (Integer) HelperClass.getInput(scanner, InputType.INT);
        System.out.println("" + getFib(targetNumber));
    }

    private static int getFib(final int target) {
        if(target == 1) return 0;
        if(target == 2) return 1;
        return getFib(target-1) + getFib(target-2);
    }
}
