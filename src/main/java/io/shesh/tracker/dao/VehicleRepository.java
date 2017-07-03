package io.shesh.tracker.dao;

/**
 * Created by shesh on 5/28/17.
 */
import io.shesh.tracker.model.Vehicle;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VehicleRepository extends Repository<Vehicle,String> {

     Vehicle findOne(String id);
     List<Vehicle> findAll();
     Vehicle save(Vehicle vehicle);
     void delete(String id);
     List<Vehicle> save(List<Vehicle> vehicle);
}
