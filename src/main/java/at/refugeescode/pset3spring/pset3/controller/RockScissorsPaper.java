package at.refugeescode.pset3spring.pset3.controller;


import at.refugeescode.pset3spring.pset3.modal.Moves;
import at.refugeescode.pset3spring.pset3.view.Displayer;
import org.springframework.stereotype.Component;

@Component
public class RockScissorsPaper {
    PlayerFactory players = new PlayerFactory();
    Displayer displayer = new Displayer();
    public void play() {
        displayer.displayWelcomeMassage();

        Players player1 = players.getPlayer1();

        Players player2 = players.getPlayer2();

        Judge judge = new Judge();
        do {
            PossibleMove move = new PossibleMove();

            displayer.displayThechoices(move);

            Moves move1 = player1.pickUpOneMove(move);

            Moves move2 = player2.pickUpOneMove(move);

            displayer.displayMovements(move1, move2);

            String theWinner = judge.judging(move1, move2);

            displayer.displayTheWiner(theWinner);

        }while (player1.wannaPlayAgain()&&player2.wannaPlayAgain());
    }
}
