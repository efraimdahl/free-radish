package me.nickvv.freeradish.core.service.api;

import java.util.Optional;

import me.nickvv.freeradish.core.rest.model.GameView;

public interface IGameService {

    GameView createGame();

    Optional<GameView> findGameByCode(String roomCode);

}
