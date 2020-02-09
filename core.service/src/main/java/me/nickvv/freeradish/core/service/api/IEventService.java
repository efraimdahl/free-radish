package me.nickvv.freeradish.core.service.api;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

import me.nickvv.freeradish.core.rest.model.EventView;

public interface IEventService {

    public void postEvent(EventView event) throws JsonProcessingException, IOException;

}
