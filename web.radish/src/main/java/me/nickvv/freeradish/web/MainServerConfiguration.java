package me.nickvv.freeradish.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import me.nickvv.freeradish.core.service.config.CoreServiceConfiguration;

@Configuration
@Import({ CoreServiceConfiguration.class })
public class MainServerConfiguration {

}
