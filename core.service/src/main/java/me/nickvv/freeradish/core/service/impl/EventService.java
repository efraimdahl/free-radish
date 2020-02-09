package me.nickvv.freeradish.core.service.impl;

import org.springframework.beans.factory.annotation.Value;

import me.nickvv.freeradish.core.rest.model.EventView;
import me.nickvv.freeradish.core.service.api.IEventService;

public class EventService implements IEventService {

    @Value("${client.webhook}")
    private String webhookUrl;

    @Override
    public void postEvent(EventView event) {
        // TODO Auto-generated method stub
        System.out.println(webhookUrl);
    }

}
