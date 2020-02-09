package me.nickvv.freeradish.repository.mem.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import me.nickvv.freeradish.core.main.model.Game;
import me.nickvv.freeradish.core.main.model.GameType;
import me.nickvv.freeradish.core.main.repository.api.IGameRepository;

/**
 * An in-memory implementation of a game repository. To be replaced with a database eventually
 * 
 * @author nickavv
 *
 */
public class InMemoryGameRepository implements IGameRepository {

    private final Map<String, Game> games;

    public InMemoryGameRepository() {
        games = new HashMap<>();
    }

    @Override
    public Game create() {
        Game created = new Game(generateRoomCode(), GameType.DEBATE);
        games.put(created.getRoomCode(), created);
        return created;
    }

    @Override
    public Game findByRoomCode(String roomCode) {
        return games.get(roomCode);
    }

    private String generateRoomCode() {
        var text = "";
        var possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        var random = new Random();
        for (var i = 0; i < 5; i++) {
            text += possibleCharacters.charAt(random.ints(0, possibleCharacters.length()).findAny().getAsInt());
        }
        return text;
    }

}
