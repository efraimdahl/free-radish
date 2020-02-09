package me.nickvv.freeradish.core.main.model;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.starchartlabs.alloy.core.MoreObjects;

public class Game {

    private final String roomCode;

    private final GameType gameType;

    public Game(@Nonnull String roomCode, @Nonnull GameType gameType) {
        this.roomCode = Objects.requireNonNull(roomCode);
        this.gameType = Objects.requireNonNull(gameType);
    }

    public String getRoomCode() {
        return roomCode;
    }

    public GameType getGameType() {
        return gameType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomCode(),
                getGameType());
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        boolean result = false;

        if (obj instanceof Game) {
            Game compare = (Game) obj;

            result = Objects.equals(compare.getRoomCode(), getRoomCode())
                    && Objects.equals(compare.getGameType(), getGameType());
        }

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass()).omitNullValues()
                .add("roomCode", getRoomCode())
                .add("gameType", getGameType())
                .toString();
    }

}
