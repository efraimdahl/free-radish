package me.nickvv.freeradish.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ MainServerConfiguration.class })
public class FreeRadishServer {

    public static void main(String[] args) {
        SpringApplication.run(FreeRadishServer.class, args);
    }

}
