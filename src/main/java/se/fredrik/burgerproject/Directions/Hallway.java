package se.fredrik.burgerproject.Directions;

import se.fredrik.burgerproject.Charcters.Burglar;
import se.fredrik.burgerproject.Charcters.Resident;
import se.fredrik.burgerproject.Information.Colours;


import static se.fredrik.burgerproject.Tools.waitTool.waitTimer;

public class Hallway implements RoomManager{


    @Override
    public void enter(Resident resident, Burglar burglar) {
        if(burglar.isConscious()){
            System.out.println(Colours.WHITE + "You enter the hallway and see a person");
            System.out.println(Colours.WHITE + "HE'S THE BURGLAR");
            System.out.println();
            waitTimer(1000);

            System.out.println(Colours.GREEN + "A fight breaks out!");
            //! Kollar om båda är vid liv
            while (resident.isConscious() && burglar.isConscious()) {

                //! Spelaren attackerar
                resident.punch(burglar);
                System.out.println();
                System.out.println(Colours.RED + "You hit the bugler");
                System.out.println(Colours.RED + "His health is now: " + " " + burglar.getHealth());
                waitTimer(1000);

                //! Kontrollera om burglar lever eller inte
                if (!burglar.isConscious()) {
                    burglar.setHealth(0);
                    System.out.println();
                    System.out.println(Colours.RED + "You killed the burglar");
                    System.out.println();
                    System.out.println(Colours.RED + "You are thinking of calling the police");
                    System.out.println(Colours.RED + "You remember the phone is in the Office");
                    waitTimer(2000);
                    break;
                }

                // Tjuven attackerar spelaren
                burglar.punch(resident);
                System.out.println();
                System.out.println(Colours.BLUE + "The burglar hit you");
                System.out.println(Colours.BLUE + "Your health is now" + " " + burglar.getHealth());
                waitTimer(1000);

                //! Kontrollerar om resident är död
                if (!resident.isConscious()) {
                    System.out.println();
                    System.out.println(Colours.BLUE + "The burglar knocked you out. He's dragging you out into the Living Room...");
                    resident.restoreToFullHealth();
                    burglar.restoreToFullHealth();
                    waitTimer(2000);
                    System.out.println(Colours.RED + "You feel rested and got full health back");
                    waitTimer(1000);
                    //! Avslutar loopen
                    break;

                }
            }

        }
        else{
            System.out.println("The burglar lies dead on the floor");
            System.out.println();
            System.out.println("Maybe you should call the police?!?!?");
            System.out.println();
            waitTimer(1000);
            System.out.println("You go back to the Living Room");
        }

    }
}
