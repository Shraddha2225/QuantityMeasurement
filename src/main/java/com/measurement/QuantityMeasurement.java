package com.measurement;
import java.util.Objects;

public class QuantityMeasurement<E>{
    private int inch;
    private int feet;
    public QuantityMeasurement() {
        this.feet = feet;
        this.inch = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return inch == that.inch &&
                feet == that.feet;
    }

    public boolean valueCheck(E value1, E value2) {
        return(Objects.equals(value1, value2));
    }

    public int conversionFeetToInch(int feetValue) {
        inch = feetValue * 12;
        return inch;
    }
}
