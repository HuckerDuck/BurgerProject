package se.fredrik.burgerproject.Directions;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.Colours;
import se.fredrik.burgerproject.Tools.InputHandler;
import se.fredrik.burgerproject.Tools.waitTimer;

public class Office implements RoomManager {

    @Override
    public void enter(Resident resident, Burglar burglar) {
        String choice;
        System.out.println("You enter the office");
        waitTimer.waitTimer(1000);
        System.out.println("You see a phone");
        System.out.println();
        if (isTheBurglarAlive(burglar)){
            toAfraidToCallWhileBurglarIsAlive();
        }

        else {
            System.out.println("Do you want to use the phone?");
            waitTimer.waitTimer(1000);
            System.out.println("Yes or no?");
            choice = InputHandler.getUserInput().toLowerCase();
            if (choice.equals("yes")) {
                useThePhoneToCallThePolice();
                System.exit(0);
            } else if (choice.equals("no")) {
                System.out.println("You don't use the phone and go back to the living room");
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }
    }

    private boolean isTheBurglarAlive(Burglar burglar) {
        return burglar.isConscious();
    }

    private void useThePhoneToCallThePolice() {
        System.out.println("You call the police ");
        System.out.println(Colours.YELLOW + "1");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.YELLOW + "1");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.YELLOW + "2");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.BLUE + "Hello, this is the police");
        System.out.println(Colours.GREEN + "Yes, a burglar came into my house and I killed him");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.GREEN + "Send for police and ambulance please");
        System.out.println(Colours.GREEN + "Quickly");
        System.out.println();
        waitTimer.waitTimer(2000);
        System.out.println(Colours.BLUE + "The police arrive at the house");
        waitTimer.waitTimer(1000);
        System.out.println();
        System.out.println("                 " + Colours.BLUE + "The" + " " + Colours.GREEN +  "game" + " " + Colours.Bright_Blue  + "is" + " " + Colours.RED + "now" + " "+ Colours.WHITE + "over");
        waitTimer.waitTimer(1000);
        System.out.println("                 " + Colours.BLUE + "Thanks" + " " + Colours.GREEN + "for" + " " +  Colours.RED + "playing");
    }

    private void toAfraidToCallWhileBurglarIsAlive(){
        System.out.println();
        System.out.println(Colours.BRIGHT_RED + "You got the feeling someone is still in house");
        waitTimer.waitTimer(1000);
        System.out.println(Colours.BRIGHT_RED + "You are simply to afraid to call for the police");
    }
}
