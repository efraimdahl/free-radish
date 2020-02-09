package me.nickvv.freeradish.core.service.converter;

import me.nickvv.freeradish.core.main.model.Game;
import me.nickvv.freeradish.core.rest.model.GameView;

public class GameViewConverter {

    public GameView toView(Game domain) {
        return new GameView(domain.getRoomCode(), domain.getGameType().name());
    }

}
