package me.nickvv.freeradish.core.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import me.nickvv.freeradish.core.main.repository.api.IGameRepository;
import me.nickvv.freeradish.core.service.api.IEventService;
import me.nickvv.freeradish.core.service.api.IGameService;
import me.nickvv.freeradish.core.service.impl.EventService;
import me.nickvv.freeradish.core.service.impl.GameService;
import me.nickvv.freeradish.repository.mem.config.InMemRepositoryConfiguration;

@Configuration
@Import({ InMemRepositoryConfiguration.class })
public class CoreServiceConfiguration {

    @Bean
    public IGameService gameService(IGameRepository gameRepository) {
        return new GameService(gameRepository);
    }

    @Bean
    public IEventService eventService() {
        return new EventService();
    }

}
