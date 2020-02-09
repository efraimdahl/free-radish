package me.nickvv.freeradish.core.main.repository.api;

import me.nickvv.freeradish.core.main.model.Game;

public interface IGameRepository {

    Game create();

    Game findByRoomCode(String roomCode);

}
