package com.app.quantitymeasurement.repository;

import java.util.List;

import com.app.quantitymeasurement.model.QuantityMeasurementEntity;

/**
 * Repository interface for storing quantity measurement operations
 */
public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> findAll();

}