package se.fredrik.burgerproject.Information;
import static se.fredrik.burgerproject.Information.Colours.*;
import static se.fredrik.burgerproject.Tools.waitTimer.waitTimer;

public class SimpleText {

    public static void pickDirection(){
        System.out.println();
        waitTimer(1000);
        System.out.println(Bright_Blue+ "You're right now in the Living Room ");
        System.out.println("");
        waitTimer(1000);
        System.out.println(RED + "1: Enter the Kitchen ");
        waitTimer(500);
        System.out.println(BLUE + "2: Enter the Hallway ");
        waitTimer(500);
        System.out.println(YELLOW + "3: Enter the Bedroom");
        waitTimer(500);
        System.out.println(GREEN + "4: Enter the Office ");
        waitTimer(500);
        System.out.println(Bright_Blue + "5: Quit ");
        waitTimer(500);
    }

    // Val AVSLUTA
    public static void choiceQuit(){
        System.out.println(PURPLE + "You picked quit ");
        System.out.println(PURPLE + "Goodbye!!!");
    }

    //! Välkomst meny
    public static void welcomeMenu(){
        System.out.println(BLUE);
        System.out.println("Välkommen till spelet");
        System.out.println();
        System.out.println("Vänligen skriv in Enter för att fortsätta eller Quit för att avsluta:  " );
    }

    public static void startOfLiving(){
        System.out.println(BLUE + "You are woken up by a strange sound");
        System.out.println("You're alone but you think someone is in the house");
        waitTimer(1000);
    }

}
