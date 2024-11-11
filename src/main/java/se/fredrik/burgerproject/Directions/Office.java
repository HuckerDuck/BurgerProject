package se.fredrik.burgerproject.Directions;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.Colours;
import se.fredrik.burgerproject.Information.SimpleText;
import se.fredrik.burgerproject.Tools.InputHandler;
import se.fredrik.burgerproject.Tools.waitTool;

public class Office implements RoomManager {

    @Override
    public void enter(Resident resident, Burglar burglar) {
        String choice;
        System.out.println(Colours.YELLOW + ("You enter the office"));
        waitTool.waitTimer(1000);
        System.out.println(Colours.YELLOW + "You see a phone");
        System.out.println();
        if (burglar.isConscious()){
            SimpleText.toAfraidToCallWhileBurglarIsAlive();
        }

        else {
            System.out.println(Colours.YELLOW + ("Do you want to use the phone?"));
            waitTool.waitTimer(1000);
            System.out.println("Yes or no?");
            choice = InputHandler.getUserInput().toLowerCase();
            if (choice.equals("yes")) {
                SimpleText.useThePhoneToCallThePolice();
                System.exit(0);
            } else if (choice.equals("no")) {
                System.out.println(Colours.YELLOW + ("You don't use the phone and go back to the living room"));
            }
            else {
                System.out.println(Colours.YELLOW + ("Invalid choice. Please enter 'yes' or 'no'."));
            }
        }
    }
}
