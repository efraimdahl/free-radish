package me.nickvv.freeradish.core.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import me.nickvv.freeradish.core.rest.model.EventView;
import me.nickvv.freeradish.core.service.api.IEventService;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EventService implements IEventService {

    @Value("${client.webhook}")
    private String webhookUrl;

    private final OkHttpClient client = new OkHttpClient();

    @Override
    public void postEvent(EventView event) throws JsonProcessingException, IOException {
        var jsonMapper = new ObjectMapper();
        var mediaType = MediaType.get("application/json; charset=utf-8");
        var body = RequestBody.create(jsonMapper.writeValueAsString(event), mediaType);
        var request = new Request.Builder()
                .url(webhookUrl)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            System.out.println("Successfully posted event");
        }
    }

}
