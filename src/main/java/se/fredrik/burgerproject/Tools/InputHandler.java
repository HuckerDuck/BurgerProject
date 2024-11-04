package se.fredrik.burgerproject.Tools;

import se.fredrik.burgerproject.Information.Colours;
import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        System.out.println();
        System.out.print(Colours.PURPLE + "Ditt val: ");
        return scanner.nextLine();
    }
}
