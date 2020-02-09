package me.nickvv.freeradish.core.service.api;

import me.nickvv.freeradish.core.rest.model.EventView;

public interface IEventService {

    public void postEvent(EventView event);

}
