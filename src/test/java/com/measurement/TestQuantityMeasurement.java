package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQuantityMeasurement {
    private QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenEqualValue_ShouldReturnTrue() {
        boolean result = quantityMeasurement.valueCheck(0,0);
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenNull_ShouldReturnFalse() {
        int FEET=quantityMeasurement.conversionFeetToInch(0);
        boolean result = quantityMeasurement.valueCheck(null,FEET);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReference_ShouldReturnTrue() {
        QuantityMeasurement referenceTwo = new QuantityMeasurement();
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
        boolean result = quantityMeasurement.valueCheck(2, 2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenNotEqual_ShouldReturnFalse() {
        boolean result = quantityMeasurement.valueCheck(2, 1);
        Assert.assertFalse(result);
    }
}