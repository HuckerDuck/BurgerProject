package se.fredrik.burgerproject.Directions;

import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Tools.waitTimer;

import static se.fredrik.burgerproject.Tools.waitTimer.waitTimer;

public class Hallway implements RoomManager{


    @Override
    public void enter(Resident resident, Burglar burglar) {
        if(burglar.isConscious()){
            System.out.println("You enter the hallway and see a person");
            System.out.println("HE'S THE BURGLAR");
            System.out.println();
            waitTimer(1000);

            System.out.println("A fight breaks out!");
            //! Kollar om båda är vid liv
            while (resident.isConscious() && burglar.isConscious()) {

                //! Spelaren attackerar
                resident.punch(burglar);
                System.out.println();
                System.out.println("You hit the bugler");
                System.out.println("His health is now: " + " " + burglar.getHealth());
                waitTimer(1000);

                //! Kontrollera om burglar lever eller inte
                if (!burglar.isConscious()) {
                    burglar.setHealth(0);
                    System.out.println();
                    System.out.println("You killed the burglar");
                    System.out.println();
                    System.out.println("You are thinking of calling the police");
                    System.out.println("You remember the phone is in the Office");
                    waitTimer(2000);
                    break;
                }

                // Tjuven attackerar spelaren
                burglar.punch(resident);
                System.out.println();
                System.out.println("The burglar hit up");
                System.out.println("Your health is now" + " " + burglar.getHealth());
                waitTimer(1000);

                //! Kontrollerar om resident är död
                if (!resident.isConscious()) {
                    System.out.println("The burglar knocked you out. Game over.");
                    //! Avslutar spelet
                    System.exit(0);
                }
            }

        }else{
            System.out.println("The burglar lies dead on the floor");
            System.out.println();
            System.out.println("Maybe you should call the police?!?!?");
            System.out.println();
            waitTimer(1000);
            System.out.println("You go back to the Living Room");
        }

    }
}
