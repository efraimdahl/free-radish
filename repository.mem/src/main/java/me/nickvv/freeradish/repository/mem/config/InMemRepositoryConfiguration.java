package me.nickvv.freeradish.repository.mem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.nickvv.freeradish.core.main.repository.api.IGameRepository;
import me.nickvv.freeradish.repository.mem.impl.InMemoryGameRepository;

@Configuration
public class InMemRepositoryConfiguration {

    @Bean
    public IGameRepository gameRepository() {
        return new InMemoryGameRepository();
    }

}
