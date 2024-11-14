package se.fredrik.burgerproject.Charcters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EntityTest {

    @org.junit.jupiter.api.Test
    void punch() {
        //! Två instanser av klasser
        Resident resident = new Resident("Resident", 15,5);
        Burglar burglar = new Burglar("Burglar", 15,5);

        //! Testa slå metoden av dessa
        //! Kontrollera med test om detta fungerar
        //! Resident damage är 5
        //! Burglar health är 15
        //! 15-5 = 10 så här ska det bli 10

        resident.punch(burglar);
        assertEquals(10, burglar.getHealth());

    }

    @Test
    void takeHit() {
        //! Skapa en instans av resident
        Resident resident = new Resident("Resident", 15, 5);

        //! Anropa metoden och ge skada
        resident.takeHit(7);

        //! Resident har 15 i health
        //! Vi tänker att han tar 7 i damage
        //! 15 - 7 = 8
        //! Så detta ska bli 8

        assertEquals(8, resident.getHealth());
    }

    @Test
    void isConscious() {
        Resident resident = new Resident("Resident", 5, 5);

        //! Testa om jag lever
        //! Denna kollar om livet är mer än 0
        //! Är livet mindre eller lika med 0 så lyckas inte testet

        assertTrue(resident.isConscious());

        //! Vi testar att sätta hp:t till 0 och ser om vi får ett falskt resultat istället
        //!
        //! Denna bör fungera... Vilket det också gör

        resident.setHealth(0);
        assertFalse(resident.isConscious());


    }
}