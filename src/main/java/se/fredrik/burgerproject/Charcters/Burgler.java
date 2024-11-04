package se.fredrik.burgerproject.Charcters;

public class Burgler extends Entity {


    public boolean isConscious() {
        if(health > 0 ){
            return true;
        }
        return false;
    }

    //! Konstruktor med bestämda värden
    public Burgler(String role, int health, int damage) {
        super(role, health, damage);
        this.health = 12;
        this.damage = 4;
        this.role="Burgler";
    }


}
