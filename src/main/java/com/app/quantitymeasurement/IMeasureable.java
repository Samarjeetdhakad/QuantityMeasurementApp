package com.app.quantitymeasurement;

public interface IMeasureable {

    double getConversionFactor();

    double convertToBaseUnit(double value);

    double convertFromBaseUnit(double baseValue);

    String getUnitName();

}
