package com.measurement;

import java.util.Objects;

public class QuantityMeasurementForInch <E> {
    private int inch;


    public QuantityMeasurementForInch() {
        this.inch = inch;
    }

    public boolean valueCheckForInch(E value1, E value2) {
        return(Objects.equals(value1, value2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurementForInch that = (QuantityMeasurementForInch) o;
        return inch == that.inch;
    }


    public double conversionInchToFeet(int inchvalue) {
        double feet = inchvalue / 12;
        return feet;
    }
}
