package me.nickvv.freeradish.web.server;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.nickvv.freeradish.core.rest.model.EventView;
import me.nickvv.freeradish.core.service.api.IEventService;

@RestController
public class EventRestServer {

    private final IEventService eventService;

    public EventRestServer(IEventService eventService) {
        this.eventService = Objects.requireNonNull(eventService);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/events")
    public ResponseEntity<Void> postEvent(@RequestBody EventView eventRequest) {
        eventService.postEvent(eventRequest);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
