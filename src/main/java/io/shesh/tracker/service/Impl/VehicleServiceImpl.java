package io.shesh.tracker.service.Impl;

import io.shesh.tracker.dao.VehicleRepository;
import io.shesh.tracker.model.Vehicle;
import io.shesh.tracker.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shesh on 5/28/17.
 */
@Service
public class VehicleServiceImpl implements VehicleService{


    @Autowired
    private VehicleRepository vehicleDao;

    @Override
    public Vehicle findById(String id) {
        return vehicleDao.findOne(id);
    }

    @Override
    @Transactional
    public List<Vehicle> findAll() {
        return vehicleDao.findAll();
    }

    @Override
    @Transactional
    public List<Vehicle> save(List<Vehicle> vehicle) {

        vehicleDao.save(vehicle);
        return vehicle;
    }



    @Override
    @Transactional
    public Vehicle save(Vehicle vehicle) {
        return vehicleDao.save(vehicle);
    }


    @Override
    @Transactional
    public void delete(String id) {
        vehicleDao.delete(id);
    }
}
