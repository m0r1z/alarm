package com.coursework.alerttransit.alerttransit;

import com.coursework.alerttransit.alerttransit.alerttransit.AlertRequestResponse;
import com.coursework.alerttransit.alerttransit.controllers.AlertsListDTO;
import com.coursework.alerttransit.alerttransit.entities.Alert;
import com.coursework.alerttransit.alerttransit.entities.AlertsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@SpringBootApplication
public class AlertTransitApplication {
    public static AlertsList alertsList = new AlertsList();
    public static boolean isAlert = false;
    private static final Logger log = LoggerFactory.getLogger(AlertTransitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AlertTransitApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            isAlert = AlertRequestResponse.isAlert(restTemplate, log, alertsList);
           checkKyivAlert(restTemplate);
        };
    }
    private static boolean checkKyivAlert(RestTemplate restTemplate){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.schedule(() ->
        {isAlert = AlertRequestResponse.isAlert(restTemplate, log, alertsList);}, 18, TimeUnit.SECONDS);
        return true;
    }
}
