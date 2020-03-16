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
    public void givenValueCheckForFeet_WhenZero_ShouldReturnTrue() {
        int result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,0);
        int result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNullForFeet_ShouldReturnFalse() {
        int FEET = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,0);
        boolean result = quantityMeasurement.valueCheck(null, FEET);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReference_ShouldReturnTrue() {
        QuantityMeasurement referenceTwo = new QuantityMeasurement();
        referenceTwo.unitConversion(QuantityMeasurement.unitType.FEET,2);
        quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,2);
        Assert.assertEquals(quantityMeasurement, referenceTwo);
    }

    @Test
    public void givenTypeForFeet_ShouldReturnTrue() {
        boolean result = quantityMeasurement.getClass().equals(this.getClass());
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        int result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,3);
        int result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,3);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetValue_WhenNotEqual_ShouldReturnFalse() {
        int result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,3);
        int result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,6);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEqualValueForInch_ShouldReturnTrue() {
        int result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,0);
        int result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNullForInch_ShouldReturnFalse() {
        double Inch = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,0);
        boolean result = quantityMeasurement.valueCheck(null, Inch);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForInch_ShouldReturnTrue() {
        QuantityMeasurement referenceTwo = new QuantityMeasurement();
        referenceTwo.unitConversion(QuantityMeasurement.unitType.INCH,2);
        quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,2);
        Assert.assertEquals(quantityMeasurement, referenceTwo);
    }


    @Test
    public void givenTypeForInch_ShouldReturnTrue() {
        boolean result = quantityMeasurement.getClass().equals(this.getClass());
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenValueCheckForInch_WhenEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,3);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,3);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenValueCheckForInch_WhenNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,12);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,4);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenValueCheckForInchAndFeet_WhenZero_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,0);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenValueCheckFor1InchAnd1Feet_ShouldReturnFalse() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,1);
        Assert.assertNotEquals(1,result);
    }

    @Test
    public void givenValueCheckFor1FeetAnd1Inch_ShouldReturnFalse() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,1);
        Assert.assertNotEquals(1,result);
    }
    @Test
    public void givenValueCheckFor1FeetAnd12Inch_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.FEET,1);
        Assert.assertEquals(12,result1,0.0);
    }

    @Test
    public void givenValueCheckFor12InchAnd1Feet_ShouldReturnFalse() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.unitType.INCH,12);
        Assert.assertNotEquals(1,result);
    }
}



























































































































































































































