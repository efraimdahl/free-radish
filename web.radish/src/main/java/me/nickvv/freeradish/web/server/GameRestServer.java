package me.nickvv.freeradish.web.server;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.nickvv.freeradish.core.rest.model.GameView;
import me.nickvv.freeradish.core.service.api.IGameService;

@RestController
public class GameRestServer {

    private final IGameService gameService;

    public GameRestServer(IGameService gameService) {
        this.gameService = Objects.requireNonNull(gameService);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/game")
    public ResponseEntity<GameView> createGame() {
        var created = gameService.createGame();
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/game/{roomCode}")
    public ResponseEntity<GameView> getGameByCode(@PathVariable("roomCode") String roomCode) {
        return gameService.findGameByCode(roomCode)
                .map(g -> new ResponseEntity<>(g, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
