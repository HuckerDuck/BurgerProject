package se.fredrik.burgerproject.Charcters;

public class Resident extends Entity {

    @Override
    public boolean isConscious() {
        if(health > 0 ){
            return true;
        }
        return false;
    }

    public Resident(String role, int health, int damage) {
        super(role, health, damage);
        this.role = "Resident";
        this.health = 12;
        this.damage = 3;

    }

    public void addDamage(int damage) {
        this.damage += damage;
    }


}
