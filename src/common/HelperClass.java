package common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HelperClass {

    // STATIC ONLY
    private HelperClass(){}

    public static Object getInput(final Scanner scanner, final InputType inputType) {



        switch (inputType) {
            case INT:
                try {
                    return scanner.nextInt();
                } catch (Exception e) {
                    System.out.print("Der eingegebene Wert ist keine Ganzzahl. Versuchen sie es erneut: ");
                    scanner.nextLine();
                    return getInput(scanner, inputType);
                }
            case LINE:
                try {
                    return scanner.nextLine();
                } catch (Exception e) {
                    System.out.print("Der eingegebene Wert ist ungültig. Versuchen sie es erneut: ");
                    scanner.nextLine();
                    return getInput(scanner, inputType);
                }
            default:
                return Integer.MAX_VALUE;
        }

    }
}
