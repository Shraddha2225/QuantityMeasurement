package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQuantityMeasurement {
    private QuantityMeasurementForFeet quantityMeasurement;
    private QuantityMeasurementForInch quantityMeasurementForInch;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurementForFeet();
        quantityMeasurementForInch = new QuantityMeasurementForInch();
    }

    @Test
    public void givenEqualValue_ShouldReturnTrue() {
        int result1 = quantityMeasurement.conversionFeetToInch(0);
        int result2 = quantityMeasurement.conversionFeetToInch(0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNull_ShouldReturnFalse() {
        int FEET = quantityMeasurement.conversionFeetToInch(0);
        boolean result = quantityMeasurement.valueCheck(null, FEET);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReference_ShouldReturnTrue() {
        QuantityMeasurementForFeet referenceTwo = new QuantityMeasurementForFeet();
        referenceTwo.conversionFeetToInch(2);
        quantityMeasurement.conversionFeetToInch(2);
        Assert.assertEquals(quantityMeasurement, referenceTwo);
    }

    @Test
    public void givenType_ShouldReturnTrue() {
        boolean result = quantityMeasurement.getClass().equals(this.getClass());
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        int result1 = quantityMeasurement.conversionFeetToInch(2);
        int result2 = quantityMeasurement.conversionFeetToInch(2);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetValue_WhenNotEqual_ShouldReturnFalse() {
        int result1 = quantityMeasurement.conversionFeetToInch(2);
        int result2 = quantityMeasurement.conversionFeetToInch(1);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEqualValueForInch_ShouldReturnTrue() {
        double result1 = quantityMeasurementForInch.conversionInchToFeet(0);
        double result2 = quantityMeasurementForInch.conversionInchToFeet(0);
        boolean result = quantityMeasurementForInch.valueCheckForInch(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNullForInch_ShouldReturnFalse() {
        double Inch = quantityMeasurementForInch.conversionInchToFeet(0);
        boolean result = quantityMeasurement.valueCheck(null, Inch);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForInch_ShouldReturnTrue() {
        QuantityMeasurementForInch referenceTwo = new QuantityMeasurementForInch();
        referenceTwo.conversionInchToFeet(2);
        quantityMeasurementForInch.conversionInchToFeet(2);
        Assert.assertEquals(quantityMeasurementForInch, referenceTwo);
    }


    @Test
    public void givenTypeForInch_ShouldReturnTrue() {
        boolean result = quantityMeasurementForInch.getClass().equals(this.getClass());
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenValueCheckForInch_WhenEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurementForInch.conversionInchToFeet(3);
        double result2 = quantityMeasurementForInch.conversionInchToFeet(3);
        boolean result = quantityMeasurementForInch.valueCheckForInch(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenValueCheckForInch_WhenNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurementForInch.conversionInchToFeet(12);
        double result2 = quantityMeasurementForInch.conversionInchToFeet(4);
        boolean result = quantityMeasurementForInch.valueCheckForInch(result1, result2);
        Assert.assertEquals(false, result);
    }
}



























































































































































































































