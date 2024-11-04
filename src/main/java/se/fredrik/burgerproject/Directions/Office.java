package se.fredrik.burgerproject.Directions;

import se.fredrik.burgerproject.Information.Colours;
import se.fredrik.burgerproject.Tools.waitTimer;

public class Office {
    public static void Go(){
        System.out.println();
        System.out.println(Colours.RED + "Go \n");
        System.out.println("You look around..");
        waitTimer.waitTimer(1000);
        System.out.println("Your in luck, you find a Frying Pan");
        System.out.println("You call your Frying pan Klas");

    }
}
