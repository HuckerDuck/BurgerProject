package se.fredrik.burgerproject.Charcters;

abstract class Entity {
    //! Attribut

    protected String role;
    protected int health;
    protected int damage;

    //! Konstruktor
    public Entity(String role, int health,  int damage) {
        this.health = health;
        this.role = role;
        this.damage = damage;
    }

    //! Konkreta metoder för att undvika att dubblikera koden
    public void punch(Entity toPunch) {
        toPunch.takeHit(this.damage);}

    public void takeHit(int damage) {
        this.health -= damage;}
    public boolean isConscious()
    {
        if (health > 0)
        {
            //! Personen är vid liv
            return true;
        }
        //* Personen är död
        return false;
    }
    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}
}
