package com.wipro.letsgo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_movement")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veh_id")
    private Long vehId; // This is your primary key

    private Double lat;

    @Column(name = "lng")
    private Double lng;

    public Long getVehId() { return vehId; }
    public void setVehId(Long vehId) { this.vehId = vehId; }

    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }

    public Double getLng() { return lng; }
    public void setLng(Double lng) { this.lng = lng; }
}
