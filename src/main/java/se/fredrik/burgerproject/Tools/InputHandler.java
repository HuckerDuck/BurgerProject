package se.fredrik.burgerproject.Tools;
import java.util.Scanner;

import static se.fredrik.burgerproject.Information.Colours.CYAN;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        System.out.println();
        System.out.print(("Ditt val: "));
        return scanner.nextLine();
    }
}