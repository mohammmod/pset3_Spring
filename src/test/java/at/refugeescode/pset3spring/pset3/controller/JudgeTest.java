package at.refugeescode.pset3spring.pset3.controller;

import at.refugeescode.pset3spring.pset3.modal.Moves;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;


class JudgeTest {
    private Judge judge;
    private Moves move1;
    private Moves move2;

    @BeforeEach
    void initialize() {
        judge = new Judge();
        move1 = Mockito.mock(Moves.class);
        move2 = Mockito.mock(Moves.class);
    }
    @org.junit.jupiter.api.Test
    void judgingCaseFirstPlayerWins() {
        Mockito.when(move1.getWinner(move2)).thenReturn(true);
        Mockito.when(move2.getWinner(move1)).thenReturn(false);
        String judging = judge.judging(move1, move2);
        Assertions.assertEquals("Player1 is the winner", judging);
    }
    @org.junit.jupiter.api.Test
    void judgingCaseSecondPlayerWins() {
        Mockito.when(move1.getWinner(move2)).thenReturn(false);
        Mockito.when(move2.getWinner(move1)).thenReturn(true);
        String judging = judge.judging(move1, move2);
        Assertions.assertEquals("Player2 is the winner", judging);
    }
    @org.junit.jupiter.api.Test
    void judgingCaseNoBodyWins() {
        Mockito.when(move1.getWinner(move2)).thenReturn(false);
        Mockito.when(move2.getWinner(move1)).thenReturn(false);
        String judging = judge.judging(move1, move2);
        Assertions.assertEquals("this is tie", judging);
    }

}