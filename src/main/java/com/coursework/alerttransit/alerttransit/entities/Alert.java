package com.coursework.alerttransit.alerttransit.entities;

import lombok.Data;
@Data
public class Alert {
    private Long id;
    private String location_title;
    private String location_type;
    private String started_at;
    private String finished_at;
    private String updated_at;
    private String alert_type;
    private String location_oblast;
    private String location_uid;
    private String notes;
    private String calculated;
}
