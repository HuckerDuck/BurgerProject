package se.fredrik.burgerproject.Information;
import se.fredrik.burgerproject.Tools.waitTool;

import static se.fredrik.burgerproject.Information.Colours.RED;
import static se.fredrik.burgerproject.Information.Colours.YELLOW;
import static se.fredrik.burgerproject.Tools.waitTool.waitTimer;

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

    public static void useThePhoneToCallThePolice() {
        System.out.println(YELLOW + "You call the police ");
        System.out.println("1");
        waitTool.waitTimer(1000);
        System.out.println("1");
        waitTool.waitTimer(1000);
        System.out.println("2");
        waitTool.waitTimer(1000);
        System.out.println("Hello, this is the police");
        System.out.println(Colours.GREEN + "Yes, a burglar came into my house and I killed him");
        waitTool.waitTimer(1000);
        System.out.println("Send for police and ambulance please");
        System.out.println("Quickly");
        System.out.println();
        waitTool.waitTimer(2000);
        System.out.println(Colours.BLUE + "The police arrive at the house");
        waitTool.waitTimer(1000);
        System.out.println("The police arrest you for murder");
        System.out.println(Colours.GREEN + "It was self defence");
        waitTool.waitTimer(1000);
        System.out.println(Colours.BLUE + "The police don't believe you");
        waitTool.waitTimer(1000);
        System.out.println(Colours.GREEN + "You are put in jail");
        waitTool.waitTimer(1000);
        System.out.println();
        System.out.println("                 " + Colours.BLUE + "The" + " " + Colours.GREEN +  "game" + " " + Colours.BLUE  + "is" + " " + RED + "now" + " "+ Colours.WHITE + "over");
        waitTool.waitTimer(1000);
        System.out.println("                 " + Colours.BLUE + "Thanks" + " " + Colours.GREEN + "for" + " " +  RED + "playing");
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

    public static void toAfraidToCallWhileBurglarIsAlive(){
        System.out.println();
        System.out.println(Colours.RED + ("You got the feeling someone is still in house"));
        waitTool.waitTimer(1000);
        System.out.println(Colours.RED + ("You are simply to afraid to call for the police"));
    }

    public static void sleepingInTheBedroom(){
        System.out.println(Colours.YELLOW + ("You enter the bedroom"));
        System.out.println(Colours.YELLOW + "The bed looks nice and comfy");
        System.out.println(Colours.YELLOW + "You lie down and rest for a bit");
        System.out.println();
        waitTool.waitTimer(1000);
        System.out.println(Colours.YELLOW + "Zzzz");
        System.out.println();
        waitTool.waitTimer(1000);
        System.out.println(Colours.YELLOW + "Zzzz");
        System.out.println();
        waitTool.waitTimer(1000);
        System.out.println(Colours.YELLOW + "Zzzz");
        System.out.println();
        waitTool.waitTimer(1000);
        System.out.println("You feel rested and stronger at the same time");
        waitTool.waitTimer(1000);
        System.out.println();
        System.out.println(Colours.YELLOW + "You awake and go back to the Living Room");
        waitTool.waitTimer(1000);
    }

}
