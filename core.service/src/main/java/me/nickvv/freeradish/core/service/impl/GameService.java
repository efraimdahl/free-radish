package me.nickvv.freeradish.core.service.impl;

import java.util.Optional;

import me.nickvv.freeradish.core.rest.model.GameType;
import me.nickvv.freeradish.core.rest.model.GameView;
import me.nickvv.freeradish.core.service.api.IGameService;

public class GameService implements IGameService {

	@Override
	public Optional<GameView> findGameByCode(String roomCode) {
		GameView gameView = new GameView("ABC123", GameType.DEBATE);
		return Optional.of(gameView);
	}

}
