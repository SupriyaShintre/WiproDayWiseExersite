package com.wipro.letsgo.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wipro.letsgo.dto.VehicleMovementRequest;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;

@RestController
@RequestMapping("/move")
public class VehicleMovementController {

    private final VehicleMovementService service;

    public VehicleMovementController(VehicleMovementService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<VehicleMovement> addMovement(@RequestBody VehicleMovementRequest req) {
        VehicleMovement movement = new VehicleMovement();
        movement.setLat(req.getLat());
        movement.setLng(req.getLongitude());
        return ResponseEntity.ok(service.save(movement));
    }

    @GetMapping
    public ResponseEntity<List<VehicleMovement>> getAllMovements() {
        return ResponseEntity.ok(service.getAll());
    }
}
