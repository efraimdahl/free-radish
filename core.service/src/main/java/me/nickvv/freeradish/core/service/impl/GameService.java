package me.nickvv.freeradish.core.service.impl;

import java.util.Objects;
import java.util.Optional;

import me.nickvv.freeradish.core.main.repository.api.IGameRepository;
import me.nickvv.freeradish.core.rest.model.GameView;
import me.nickvv.freeradish.core.service.api.IGameService;
import me.nickvv.freeradish.core.service.converter.GameViewConverter;

public class GameService implements IGameService {

    private final IGameRepository gameRepository;

    private final GameViewConverter gameViewConverter = new GameViewConverter();

    public GameService(IGameRepository gameRepository) {
        this.gameRepository = Objects.requireNonNull(gameRepository);
    }

    @Override
    public GameView createGame() {
        return gameViewConverter.toView(gameRepository.create());
    }

    @Override
    public Optional<GameView> findGameByCode(String roomCode) {
        return Optional.ofNullable(gameRepository.findByRoomCode(roomCode))
                .map(gameViewConverter::toView);
    }

}
