package se.fredrik.burgerproject.Information;
import static se.fredrik.burgerproject.Information.Colours.*;
import static se.fredrik.burgerproject.Tools.waitTimer.waitTimer;

public class ErrorHandling {

    //Metod för fel val
    public static void wrongChoice(){
        System.out.println("\n"+ "\n"+ Colours.GREEN + "Pick a number between 1-5");
    }

    public static void invalidChoice(){
        System.out.println("\n" + Colours.GREEN + "Invalid choice");
        System.out.println(Colours.GREEN + "Please write Enter or Quit");
        waitTimer(1000);
        System.out.println();
    }

}
