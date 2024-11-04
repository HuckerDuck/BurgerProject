package se.fredrik.burgerproject.Directions;

import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.Colours;
import se.fredrik.burgerproject.Tools.waitTimer;

public class Bedroom implements RoomManager {
    @Override
    public void enter(Resident resident, Burglar burglar) {
        System.out.println();
        System.out.println(Colours.YELLOW);
        System.out.println("You enter the bedroom");
        System.out.println("The bed looks nice and comfy");
        System.out.println("You lie down and rest for a bit");
        System.out.println();
        waitTimer.waitTimer(1000);
        System.out.println("Zzzz");
        System.out.println();
        waitTimer.waitTimer(1000);
        System.out.println("Zzzz");
        System.out.println();
        waitTimer.waitTimer(1000);
        System.out.println("Zzzz");
        System.out.println();
        waitTimer.waitTimer(1000);
        System.out.println();
        System.out.println("You awake and go back to the Living Room");
        waitTimer.waitTimer(1000);


    }
}
