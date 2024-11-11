package se.fredrik.burgerproject.Directions;
import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.SimpleText;

public class Bedroom implements RoomManager {
    @Override
    public void enter(Resident resident, Burglar burglar) {
        SimpleText.sleepingInTheBedroom();
        resident.addDamage(1);
    }
}
