package com.wipro.letsgo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleMovementRequest {

    private Double lat;

    @JsonProperty("long")
    private Double longitude;

    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
}
