package se.fredrik.burgerproject.Charcters;

public class Burglar extends Entity {


    public boolean isConscious() {
        if(health > 0 ){
            return true;
        }
        return false;
    }

    //! Konstruktor med bestämda värden
    public Burglar(String role, int health, int damage) {
        super(role, health, damage);
    }

    public void restoreToFullHealth(){
        this.health = 12;
    }


}
