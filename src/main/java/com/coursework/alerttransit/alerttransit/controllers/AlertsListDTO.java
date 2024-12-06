package com.coursework.alerttransit.alerttransit.controllers;

import com.coursework.alerttransit.alerttransit.entities.Alert;
import lombok.Data;

import java.util.List;
@Data
public class AlertsListDTO {
    private List<Alert> alerts;
    private Meta meta;
    private String disclaimer;
    @Data
    public class Meta{
        private String last_updated_at;
        private String type;
    }
}
