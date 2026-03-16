package com.app.quantitymeasurement.repository;

import java.util.ArrayList;
import java.util.List;

import com.app.quantitymeasurement.model.QuantityMeasurementEntity;

/**
 * Cache repository for storing quantity measurement operations
 */
public class QuantityMeasurementCacheRepository implements IQuantityMeasurementRepository {

    private final List<QuantityMeasurementEntity> cache = new ArrayList<>();

    @Override
    public void save(QuantityMeasurementEntity entity) {
        cache.add(entity);
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {
        return cache;
    }
}