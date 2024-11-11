package se.fredrik.burgerproject.Charcters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ResidentTest {

    @Test
    void restoreToFullHealth() {
        Resident resident = new Resident("TestPerson", 5, 3);

        resident.restoreToFullHealth();

        //! Sätter hp:et till 5
        //! Funktionen restoreToFullHealth ska sätta hp:t till 12
        //!
        //! Om det funkar blir det godkänt

        assertEquals(11, resident.getHealth());

    }
}