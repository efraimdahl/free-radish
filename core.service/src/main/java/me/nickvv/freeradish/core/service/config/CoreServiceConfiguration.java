package me.nickvv.freeradish.core.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.nickvv.freeradish.core.service.api.IGameService;
import me.nickvv.freeradish.core.service.impl.GameService;

@Configuration
public class CoreServiceConfiguration {

    @Bean
    public IGameService gameService() {
        return new GameService();
    }

}
