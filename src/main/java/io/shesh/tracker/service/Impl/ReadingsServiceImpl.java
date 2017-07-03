package io.shesh.tracker.service.Impl;

import io.shesh.tracker.dao.ReadingsRepository;
import io.shesh.tracker.model.Readings;
import io.shesh.tracker.service.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by shesh on 5/28/17.
 */
@Service
public class ReadingsServiceImpl implements ReadingsService {

    @Autowired
    private ReadingsRepository readingsDao;

    @Override
    @Transactional
    public Readings create(Readings readings) {
        System.out.println(" IN SERVICE FIR REAING"+readings.toString());
        return readingsDao.save(readings);
    }

    @Override
    @Transactional
    public Readings update(Readings readings) {
        return readingsDao.save(readings);
    }

    @Override
    @Transactional
    public void delete(String id) {
        readingsDao.deleteByVin(id);

    }

    @Override
    @Transactional
    public List<Readings> findAll() {
        return readingsDao.findAll();
    }


    @Override
    @Transactional
    public List<Readings> findReadingByVehicleId(String id) {
        return readingsDao.findByVin(id);
    }
}
