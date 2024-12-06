package com.coursework.alerttransit.alerttransit.alerttransit;

import com.coursework.alerttransit.alerttransit.controllers.AlertsListDTO;
import com.coursework.alerttransit.alerttransit.entities.AlertsList;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

    public class AlertRequestResponse {
    public static boolean isAlert(RestTemplate restTemplate, Logger log, AlertsList alertsList){
//        AlertsListDTO alertsListDTO = restTemplate.getForObject(
//                "https://api.alerts.in.ua/v1/alerts/active.json", AlertsListDTO.class);
//        log.info(alertsListDTO.toString());
//        alertsList.setAlertList(alertsListDTO.getAlerts());
//        boolean isAlert = alertsList.getAlertList().stream()
//                .anyMatch(x -> x.getLocation_title().equals("м. Київ"));
//        System.out.println("INFORMATION UPDATED");
        return true; // TODO return data of alerts
    }
}
