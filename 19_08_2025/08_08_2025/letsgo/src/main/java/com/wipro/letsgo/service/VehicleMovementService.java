package com.wipro.letsgo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repository.VehicleMovementRepository;

@Service
public class VehicleMovementService {

    private final VehicleMovementRepository repository;

    public VehicleMovementService(VehicleMovementRepository repository) {
        this.repository = repository;
    }

    public VehicleMovement save(VehicleMovement movement) {
        return repository.save(movement);
    }

    public List<VehicleMovement> getAll() {
        return repository.findAll();
    }
}
