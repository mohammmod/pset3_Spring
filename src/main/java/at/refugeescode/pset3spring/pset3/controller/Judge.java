package at.refugeescode.pset3spring.pset3.controller;


import at.refugeescode.pset3spring.pset3.modal.Moves;

public class Judge {
    public String judging(Moves move1, Moves move2) {

        if (move1.getWinner(move2) == true) {
            return "Player1 is the winner";
        } else if (move2.getWinner(move1)==true){
            return "Player2 is the winner";
        }else{
            return "this is tie";
        }
    }
}
