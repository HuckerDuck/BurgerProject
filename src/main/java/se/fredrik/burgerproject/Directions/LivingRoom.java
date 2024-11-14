package se.fredrik.burgerproject.Directions;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.ErrorHandling;
import se.fredrik.burgerproject.Information.SimpleText;
import static se.fredrik.burgerproject.Tools.InputHandler.getUserInput;

public class LivingRoom implements RoomManager {
    //! Instanser av alla rum
    Kitchen kitchen = new Kitchen();
    Hallway hallway = new Hallway();
    Bedroom bedroom = new Bedroom();
    Office   office = new Office();

    public void enter(Resident resident, Burglar burglar) {
        boolean running = true;
        while (running) {
            SimpleText.pickDirection();
            String choice = getUserInput();
            switch (choice) {
                case "1" -> kitchen.enter(resident, burglar);
                case "2" -> hallway.enter(resident, burglar);
                case "3" -> bedroom.enter(resident, burglar);
                case "4" -> office.enter (resident, burglar);
                case "5" -> {
                    SimpleText.choiceQuit();
                    running = false;
                }
                default -> ErrorHandling.wrongChoice();
            }
        }
    }
}
