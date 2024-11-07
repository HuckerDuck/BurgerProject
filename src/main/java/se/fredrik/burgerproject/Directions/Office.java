package se.fredrik.burgerproject.Directions;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.Colours;
import se.fredrik.burgerproject.Tools.InputHandler;
import se.fredrik.burgerproject.Tools.waitTimer;
import static java.awt.Color.GREEN;
import static se.fredrik.burgerproject.Information.Colours.RED;
import static se.fredrik.burgerproject.Information.Colours.YELLOW;

public class Office implements RoomManager {

    @Override
    public void enter(Resident resident, Burglar burglar) {
        String choice;
        System.out.println(Colours.YELLOW + ("You enter the office"));
        waitTimer.waitTimer(1000);
        System.out.println(Colours.YELLOW + "You see a phone");
        System.out.println();
        if (burglar.isConscious()){
            toAfraidToCallWhileBurglarIsAlive();
        }

        else {
            System.out.println(Colours.YELLOW + ("Do you want to use the phone?"));
            waitTimer.waitTimer(1000);
            System.out.println("Yes or no?");
            choice = InputHandler.getUserInput().toLowerCase();
            if (choice.equals("yes")) {
                useThePhoneToCallThePolice();
                System.exit(0);
            } else if (choice.equals("no")) {
                System.out.println(Colours.YELLOW + ("You don't use the phone and go back to the living room"));
            }
            else {
                System.out.println(Colours.YELLOW + ("Invalid choice. Please enter 'yes' or 'no'."));
            }
        }
    }

    private void useThePhoneToCallThePolice() {
        System.out.println(YELLOW + "You call the police ");
        System.out.println("1");
        waitTimer.waitTimer(1000);
        System.out.println("1");
        waitTimer.waitTimer(1000);
        System.out.println("2");
        waitTimer.waitTimer(1000);
        System.out.println("Hello, this is the police");
        System.out.println(Colours.GREEN + "Yes, a burglar came into my house and I killed him");
        waitTimer.waitTimer(1000);
        System.out.println("Send for police and ambulance please");
        System.out.println("Quickly");
        System.out.println();
        waitTimer.waitTimer(2000);
        System.out.println(Colours.BLUE + "The police arrive at the house");
        waitTimer.waitTimer(1000);
        System.out.println("The police arrest you for murder");
        System.out.println(Colours.GREEN + "It was self defence");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.BLUE + "The police don't believe you");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.GREEN + "You are put in jail");
        waitTimer.waitTimer(1000);
        System.out.println();
        System.out.println("                 " + Colours.BLUE + "The" + " " + Colours.GREEN +  "game" + " " + Colours.BLUE  + "is" + " " + RED + "now" + " "+ Colours.WHITE + "over");
        waitTimer.waitTimer(1000);
        System.out.println("                 " + Colours.BLUE + "Thanks" + " " + Colours.GREEN + "for" + " " +  RED + "playing");
    }

    private void toAfraidToCallWhileBurglarIsAlive(){
        System.out.println();
        System.out.println(Colours.RED + ("You got the feeling someone is still in house"));
        waitTimer.waitTimer(1000);
        System.out.println(Colours.RED + ("You are simply to afraid to call for the police"));
    }
}
