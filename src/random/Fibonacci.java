package random;

import java.util.Scanner;

public class Fibonacci {

    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("Bitte geben sie die nte Zahl ein, die sie aus der Fibonacci Sequenz haben wollen: ");
        final int targetNumber = getInput();
        System.out.println("" + getFib(targetNumber));
    }

    private static int getFib(final int target) {
        if(target == 1) return 0;
        if(target == 2) return 1;
        return getFib(target-1) + getFib(target-2);
    }
    private static int getInput() {

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Der eingegebene Wert ist keine Ganzzahl. Versuchen sie es erneut: ");
            scanner.nextLine();
            return getInput();
        }
    }
}
