package at.refugeescode.pset3spring.pset3.modal;

import at.refugeescode.pset3spring.pset3.modal.Moves;

public class Spock implements Moves {
    @Override
    public String getName() {
        return "Spock";
    }

    @Override
    public boolean getWinner(Moves move) {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();
        String rockName = rock.getName();
        String scissorsName = scissors.getName();

        if (move.getName().equalsIgnoreCase(rockName)||move.getName().equalsIgnoreCase(scissorsName)){
            return true;
        }
        return false;
    }
}
