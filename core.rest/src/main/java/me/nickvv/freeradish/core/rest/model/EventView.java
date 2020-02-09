package me.nickvv.freeradish.core.rest.model;

import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.starchartlabs.alloy.core.MoreObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventView {

    @JsonProperty
    private final String roomCode;

    @JsonProperty
    private final String eventName;

    @JsonProperty
    private final String eventValue;

    public EventView(@Nonnull @JsonProperty("roomCode") String roomCode,
            @Nonnull @JsonProperty("eventName") String eventName,
            @Nonnull @JsonProperty("eventValue") String eventValue) {
        this.roomCode = Objects.requireNonNull(roomCode);
        this.eventName = Objects.requireNonNull(eventName);
        this.eventValue = Objects.requireNonNull(eventValue);
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventValue() {
        return eventValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomCode(),
                getEventName(),
                getEventValue());
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        boolean result = false;

        if (obj instanceof EventView) {
            EventView compare = (EventView) obj;

            result = Objects.equals(compare.getRoomCode(), getRoomCode())
                    && Objects.equals(compare.getEventName(), getEventName())
                    && Objects.equals(compare.getEventValue(), getEventValue());
        }

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass()).omitNullValues()
                .add("roomCode", getRoomCode())
                .add("eventName", getEventName())
                .add("eventValue", getEventValue())
                .toString();
    }

}
