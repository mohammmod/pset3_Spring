package at.refugeescode.pset3spring.pset3.controller;


import at.refugeescode.pset3spring.pset3.controller.Player1;
import at.refugeescode.pset3spring.pset3.controller.Player2;
import at.refugeescode.pset3spring.pset3.controller.Players;

public class PlayerFactory {
    public Players getPlayer1(){
        return new Player1();
    }
    public Players getPlayer2(){
        return new Player2();
    }

}
