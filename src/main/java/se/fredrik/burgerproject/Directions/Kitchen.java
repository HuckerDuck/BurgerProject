package se.fredrik.burgerproject.Directions;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Tools.InputHandler;
import se.fredrik.burgerproject.Tools.waitTool;

import static se.fredrik.burgerproject.Information.Colours.RED;


public class Kitchen implements RoomManager {
    private static Boolean foundFryingPan = false;

    @Override
    public void enter(Resident resident, Burglar burglar) {

        System.out.println(RED + "You enter the kitchen...");
        waitTool.waitTimer(1000);

        if (!foundFryingPan) {
            System.out.println("You spot a frying pan. Do you want to pick it up? (yes/no)");
            String choice;

            //! Do-while loop
            do {
                choice = InputHandler.getUserInput().toLowerCase();

                if (choice.equals("yes")) {
                    System.out.println();
                    System.out.println("You take the frying pan in your hand and feel stronger.");
                    System.out.println("You exit the kitchen and go back to the living room");
                    waitTool.waitTimer(1000);

                    //! Öka damagen på resident
                    resident.addDamage(3);

                    //! Markera att stekpannan nu är tagen
                    foundFryingPan = true;
                } else if (choice.equals("no")) {
                    System.out.println(RED + "You don't like the frying pan..");
                } else {
                    System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
                }
            }
            while (!choice.equals("yes") && !choice.equals("no"));
        }

        else {
            System.out.println(RED + "The kitchen looks the same, but there's no frying pan here anymore.");
        }
    }
}
