package me.nickvv.freeradish.core.rest.model;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.starchartlabs.alloy.core.MoreObjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameView {

	@JsonProperty("roomCode")
	private final String roomCode;
	
	@JsonProperty("gameType")
	private final GameType gameType;
	
	@JsonCreator
	public GameView(@Nonnull @JsonProperty("roomCode") String roomCode, @Nonnull @JsonProperty("gameType") GameType gameType) {
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
		return Objects.hash(getRoomCode(), getGameType());
	}

	@Override
	public boolean equals(@Nullable Object obj) {
		boolean result = false;

		if (obj instanceof GameView) {
			GameView compare = (GameView) obj;

			result = Objects.equals(compare.getRoomCode(), getRoomCode())
					&& Objects.equals(compare.getGameType(), getGameType());
		}

		return result;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(getClass()).omitNullValues().add("roomCode", getRoomCode())
				.add("gameType", getGameType()).toString();
	}
	
}
