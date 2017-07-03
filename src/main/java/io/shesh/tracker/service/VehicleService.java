package io.shesh.tracker.service;

import io.shesh.tracker.model.Vehicle;

import java.util.List;

/**
 * Created by shesh on 5/28/17.
 */
public interface VehicleService {
    Vehicle findById(String id);
    List<Vehicle> findAll();
    Vehicle save(Vehicle vehicle);
    void delete(String id);
    public List<Vehicle> save(List<Vehicle> vehicle);
}
