package io.shesh.tracker.dao;

import io.shesh.tracker.model.Alert;
import io.shesh.tracker.model.Readings;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by shesh on 5/28/17.
 */
public interface AlertRepository extends Repository<Alert,String>{
     Alert save(Alert alert);
     List<Alert> findByVin(String id);
     void delete(Alert alert);
     void deleteByVin(String vin);
     List<Alert> findAll();

}
