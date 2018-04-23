package org.ashabl.spring.boot.starter;

import org.ashabl.spring.boot.starter.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication implements CommandLineRunner {

    @Autowired
    private WeatherService weatherService;

    @Override
    public void run(String... args) throws Exception {
        //weather forecast, default is sunny day!
        System.out.println(weatherService.forecast());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}