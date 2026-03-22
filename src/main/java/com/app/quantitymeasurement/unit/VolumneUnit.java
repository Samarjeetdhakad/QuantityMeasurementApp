package com.app.quantitymeasurement.unit;
public enum VolumneUnit implements IMeasurable {

	 LITRE(1.0),
	    MILLILITRE(0.001),
	    GALLON(3.78541);

	    private final double conversionFactor; 

	    VolumneUnit(double conversionFactor) 
	    {
	        this.conversionFactor = conversionFactor;
	    }

	    @Override
	    public double convertToBaseUnit(double value)
	    {
	        return value * conversionFactor;
	    }

	    @Override
	    public double convertFromBaseUnit(double baseValue) 
	    {
	        return baseValue / conversionFactor;
	    }

	    @Override
	    public String getUnitName() 
	    {
	        return this.name();
	    }

	    
	    
	    public double getConversionFactor() 
	    {
	        return conversionFactor;
	    }
	    
	    @Override
	    public MeasurementType getMeasurementType() 
	    {
	        return MeasurementType.VOLUME;
	    }

	}