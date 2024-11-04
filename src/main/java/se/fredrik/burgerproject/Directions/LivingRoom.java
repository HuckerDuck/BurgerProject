package se.fredrik.burgerproject.Directions;

import se.fredrik.burgerproject.Charcters.Burgler;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.SimpleText;

import static se.fredrik.burgerproject.Information.ErrorHandling.wrongChoice;
import static se.fredrik.burgerproject.Tools.InputHandler.getUserInput;
import static se.fredrik.burgerproject.Tools.waitTimer.waitTimer;

public class LivingRoom {

    //! Instanser som används senare
    private Resident resident;
    private Burgler burgler;

    //! Rummet där jag är nu
    private static String currentLocation;


    public static void Go(Resident resident, Burgler burgler) {
        boolean running = true;
        while (running) {
            SimpleText.pickDirection();
                String choice = getUserInput();
                switch (choice) {
                    case "1" -> Kitchen.Go();
                    case "2" -> Office.Go();
                    case "3" -> Bedroom.Go();
                    case "4" -> Office.Go();
                    case "5" -> running = false;
                    default -> {
                        wrongChoice();
                        waitTimer(1000);
                    }
                }
        }
    }
}
