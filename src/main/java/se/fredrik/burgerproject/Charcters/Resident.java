package se.fredrik.burgerproject.Charcters;

public class Resident extends Entity {

    @Override
    public boolean isConscious() {
        if(health > 0 ){
            return true;
        }
        return false;
    }

    //! För att undvika fel i testen så är det viktigt att
    //! Inga värden är hårdkodade i konstruktorn.
    public Resident(String role, int health, int damage) {
        super(role, health, damage);
    }

    public void addDamage(int damage) {
        this.damage += damage;
    }


}
