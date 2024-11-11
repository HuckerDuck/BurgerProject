package se.fredrik.burgerproject.Tools;
import java.util.Scanner;



public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        System.out.println();
        System.out.print(("Ditt val: "));
        return scanner.nextLine();
    }
}