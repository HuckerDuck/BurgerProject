package se.fredrik.burgerproject.Game;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Directions.LivingRoom;
import se.fredrik.burgerproject.Information.ErrorHandling;
import se.fredrik.burgerproject.Information.SimpleText;
import se.fredrik.burgerproject.Tools.InputHandler;

public class Game {

    //! Skapar en instans av LivingRoom
    LivingRoom livingRoom = new LivingRoom();


    public void start() {
        Resident resident = new Resident("Resident", 12 ,3);
        Burglar burglar = new Burglar("Burglar", 12 ,4);
        var running = true;

        while (running) {
            SimpleText.welcomeMenu();
            String input = InputHandler.getUserInput();
            if (input.equalsIgnoreCase("enter")) {
                SimpleText.startOfLiving();
                livingRoom.enter(resident, burglar); // Starta spelet i vardagsrummet

            }
            else if (input.equalsIgnoreCase("exit")) {
                running = false; // Avslutar spelet om spelaren väljer "exit"

            }
            else {
                ErrorHandling.invalidChoice(); // Hanterar ogiltig inmatning
            }
        }
    }
}
