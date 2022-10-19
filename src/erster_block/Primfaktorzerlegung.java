package erster_block;

import common.HelperClass;
import common.InputType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primfaktorzerlegung {

    private static final List<Integer> integerArrayList = new ArrayList<>();
    private static int targetNumber;

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        final Scanner scanner = new Scanner(System.in);
        targetNumber = (Integer) HelperClass.getInput(scanner, InputType.INT);

        mainLoop();
        integerArrayList.forEach(System.out::println);
    }

    private static void mainLoop() {
        boolean found = false;
        for (int i = 2; i < targetNumber; i++) {
            if(targetNumber % i == 0 && !found) {
                integerArrayList.add(i);
                targetNumber/=i;
                found=true;
            }
        }
        if(!found) {
            integerArrayList.add(targetNumber);
            return;
        }
        mainLoop();
    }
}
