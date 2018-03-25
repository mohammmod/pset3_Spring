package at.refugeescode.pset3spring.pset3;


import at.refugeescode.pset3spring.pset3.controller.RockScissorsPaper;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Maingame {
    @Bean
    public ApplicationRunner myGame(RockScissorsPaper rockScissorsPaper){
        return starting ->{
          rockScissorsPaper.play();
        };
    }
}
