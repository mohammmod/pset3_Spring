package at.refugeescode.pset3spring.pset3.controller;


import at.refugeescode.pset3spring.pset3.modal.Moves;

public interface Players {
    Moves pickUpOneMove(PossibleMove oneMove);
    boolean wannaPlayAgain();
}
