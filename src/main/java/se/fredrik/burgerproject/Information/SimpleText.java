package se.fredrik.burgerproject.Information;
import static se.fredrik.burgerproject.Information.Colours.*;
import static se.fredrik.burgerproject.Tools.waitTimer.waitTimer;

public class SimpleText {
    public static void pickDirection() {
        System.out.println();
        waitTimer(1000);
        System.out.println(Colours.BLUE + "You're right now in the Living Room");
        waitTimer(1000);
        System.out.println("\n" + Colours.RED + "1: Enter the Kitchen");
        waitTimer(500);
        System.out.println(Colours.BLUE + "2: Enter the Hallway");
        waitTimer(500);
        System.out.println(Colours.YELLOW + "3: Enter the Bedroom");
        waitTimer(500);
        System.out.println(Colours.GREEN + "4: Enter the Office");
        waitTimer(500);
        System.out.println(Colours.CYAN + "5: Quit");
        waitTimer(500);
    }


    // Val AVSLUTA
    public static void choiceQuit(){
        System.out.println(Colours.YELLOW +"You picked quit ");
        System.out.println(Colours.YELLOW +"Goodbye!!!");
    }

    //! Välkomst meny
    public static void welcomeMenu(){
        System.out.println("\n" + Colours.BLUE + "Välkommen till spelet");
        System.out.println("\n" + Colours.BLUE + "Vänligen skriv in Enter för att fortsätta eller Quit för att avsluta: ");
    }

    public static void startOfLiving(){
        System.out.println("\n" + Colours.RED + "You are woken up by a strange sound");
        System.out.println("\n" + Colours.RED + "You're alone but you think someone is in the house");
        waitTimer(1000);
    }

}
