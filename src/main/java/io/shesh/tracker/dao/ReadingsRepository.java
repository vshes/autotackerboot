package io.shesh.tracker.dao;

import io.shesh.tracker.model.Readings;
import org.springframework.data.repository.Repository;

import java.util.List;
/**
 * Created by shesh on 5/28/17.
 */
public interface ReadingsRepository extends Repository<Readings,String >{
    Readings save(Readings readings);
    void deleteByVin(String  vin);
    void delete(Readings readings);
    List<Readings> findAll();
    List<Readings> findByVin(String id);

}
