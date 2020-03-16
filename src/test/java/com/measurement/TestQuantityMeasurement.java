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
        boolean result = quantityMeasurement.valueCheck(0, 0);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNullForFeet_ShouldReturnFalse() {
        double FEET = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,0);
        boolean result = quantityMeasurement.valueCheck(null, FEET);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReference_ShouldReturnTrue() {
        QuantityMeasurement referenceTwo = new QuantityMeasurement();
        referenceTwo.unitConversion(QuantityMeasurement.UnitType.FEET,2);
        quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,2);
        Assert.assertEquals(quantityMeasurement, referenceTwo);
    }

    @Test
    public void givenTypeForFeet_ShouldReturnTrue() {
        boolean result = quantityMeasurement.getClass().equals(this.getClass());
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,3);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,3);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetValue_WhenNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,3);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEET,6);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEqualValueForInch_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,0);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNullForInch_ShouldReturnFalse() {
        double Inch = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,0);
        boolean result = quantityMeasurement.valueCheck(null, Inch);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForInch_ShouldReturnTrue() {
        QuantityMeasurement referenceTwo = new QuantityMeasurement();
        referenceTwo.unitConversion(QuantityMeasurement.UnitType.INCH,2);
        quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,2);
        Assert.assertEquals(quantityMeasurement, referenceTwo);
    }


    @Test
    public void givenTypeForInch_ShouldReturnTrue() {
        boolean result = quantityMeasurement.getClass().equals(this.getClass());
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenValueCheckForInch_WhenEqual_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,3);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,3);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenValueCheckForInch_WhenNotEqual_ShouldReturnFalse() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,12);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCH,0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenValueCheckForInchAndFeet_WhenZero_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCHTOFEET,0);
        double result2 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEETTOINCH,0);
        boolean result = quantityMeasurement.valueCheck(result1, result2);
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenValueCheckFor1InchAnd1Feet_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCHTOFEET,1);
        Assert.assertNotEquals(1,result);
    }

    @Test
    public void givenValueCheckFor1FeetAnd1Inch_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEETTOINCH,1);
        Assert.assertNotEquals(1,result);
    }
    @Test
    public void givenValueCheckFor1FeetAnd12Inch_ShouldReturnTrue() {
        double result1 = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEETTOINCH,1);
        Assert.assertEquals(12,result1,0.0);
    }

    @Test
    public void givenValueCheckFor12InchAnd1Feet_ShouldReturnFalse() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCHTOFEET,12);
        Assert.assertNotEquals(1,result);
    }
    @Test
    public void givenValueCheckFor3FeetTo1Yard_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEETTOYARDS,3);
        Assert.assertEquals(1,result,0.0);
    }
    @Test
    public void givenValueCheckFor1FeetTo1Yard_WhenNotEqual_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.FEETTOYARDS,1);
        Assert.assertNotEquals(1,result);
    }
    @Test
    public void givenValueCheckFor1InchTo1Yard_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCHTOYARDS,1);
        Assert.assertNotEquals(1,result);
    }
    @Test
    public void givenValueCheckFor1YardToInch_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARDSTOINCH,1);
        Assert.assertEquals(36,result,0.0);
    }
    @Test
    public void givenValueCheckFor36InchToYard_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCHTOYARDS,36);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void givenValueCheckFor1YardToFeet_ShouldReturnTrue() {
        double result = quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.YARDSTOFEET,1);
        Assert.assertEquals(3,result,0.0);
    }

    @Test
    public void givenValueCheckForInchToCentimetre_ShouldReturnTrue() {
        double result =quantityMeasurement.unitConversion(QuantityMeasurement.UnitType.INCHTOCENTIMETER, 2);
        Assert.assertEquals(5,result,0.0);
    }
}



























































































































































































































