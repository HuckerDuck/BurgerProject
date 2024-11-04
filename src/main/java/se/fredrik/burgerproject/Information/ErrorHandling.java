package se.fredrik.burgerproject.Information;
import static se.fredrik.burgerproject.Information.Colours.*;
import static se.fredrik.burgerproject.Tools.waitTimer.waitTimer;

public class ErrorHandling {

    //Metod för fel val
    public static void wrongChoice(){
        System.out.println();
        System.out.println();
        System.out.println(BACKGROUND_YELLOW + BLACK + "Pick a number between 1-5");
        System.out.println(RESET);

    }

    public static void invalidChoice(){
        System.out.println();
        System.out.println(BACKGROUND_YELLOW + BLACK + "Invalid choice");
        System.out.println(BACKGROUND_YELLOW + BLACK + "Please write Enter or Quit");
        System.out.println(RESET);
        waitTimer(1000);
        System.out.println();
    }

}
