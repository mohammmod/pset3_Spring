package at.refugeescode.pset3spring.pset3.modal;

import at.refugeescode.pset3spring.pset3.modal.Moves;

public class Rock implements Moves {
    @Override
    public String getName(){
        return "Rock";
    }

    @Override
    public boolean getWinner(Moves move) {
        Scissors scissors = new Scissors();
        Lizard lizard = new Lizard();
        String scissorsName = scissors.getName();
        String lizardName = lizard.getName();
        if (move.getName().equalsIgnoreCase(scissorsName)||move.getName().equalsIgnoreCase(lizardName)){
            return true;
        }
        return false;
    }

}
