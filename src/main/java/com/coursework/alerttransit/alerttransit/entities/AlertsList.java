package com.coursework.alerttransit.alerttransit.entities;

import com.coursework.alerttransit.alerttransit.controllers.AlertsListDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
public class AlertsList {
    private List<Alert> alertList;

    public AlertsList() {
        alertList = new ArrayList<>();
    }

    public AlertsList(AlertsListDTO alertsListDTO) {
        this.alertList = alertsListDTO.getAlerts();
    }
}
