package se.fredrik.burgerproject.game;
import se.fredrik.burgerproject.Charcters.Burgler;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Directions.LivingRoom;
import se.fredrik.burgerproject.Information.ErrorHandling;
import se.fredrik.burgerproject.Information.SimpleText;
import se.fredrik.burgerproject.Tools.InputHandler;

public class Game {
    //! Skapande av instanser
    private static Resident resident;
    private static Burgler burgler;


    public static void start() {
        var running = true;
        while (running) {
            SimpleText.welcomeMenu();
            String input = InputHandler.getUserInput();
            if(input.equalsIgnoreCase("enter")){
                SimpleText.startOfLiving();
                LivingRoom.Go(Resident resident, Burgler burgler);
            }

            else if(input.equalsIgnoreCase("exit")){running = false;}
            else {ErrorHandling.invalidChoice();}
        }
    }
}
