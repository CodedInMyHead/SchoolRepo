package zweiter_block;

import common.HelperClass;
import common.InputType;

import java.util.Scanner;

public class Aufgabe5Zylinderberechnung {

    static int height;
    static int radius;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String targetString = HelperClass.getInput(scanner, InputType.LINE) == null ? "S" : HelperClass.getInput(scanner, InputType.LINE).toString();
        int height =  (Integer) HelperClass.getInput(scanner, InputType.INT);
        int radius =  (Integer) HelperClass.getInput(scanner, InputType.INT);

        if(height <= 0 || radius <= 0) throw new IllegalArgumentException("Bro u dumb?");
        if(height > 10000  || radius > 10000 ) {
            System.out.println("Ungünstige Werte!");
        }
        switch (targetString) {
            case "U":
                berechneUmfang();
                break;
            case "G":
                berechneGrundflaeche();
                break;
            case "M":
                berechneMantel();
                break;
            case "O":
                berechneOberflaeche();
                break;
            case "V":
                berechneVolumen();
                break;
            default:
                System.out.println("Error.");
        }
    }

    private static void berechneUmfang() {
        final double result = 2 * Math.PI * radius;
        System.out.println(result);
    }

    private static void berechneGrundflaeche() {
        final double result = Math.PI * radius * radius;
        System.out.println(result);
    }

    private static void berechneMantel() {
        final double result = 2 * Math.PI * radius * height;
        System.out.println(result);
    }

    private static void berechneOberflaeche() {
        final double result = 2 * Math.PI * radius * (radius+height);
        System.out.println(result);
    }

    private static void berechneVolumen() {
        final double result = Math.PI * radius * radius * height;
        System.out.println(result);
    }
}
