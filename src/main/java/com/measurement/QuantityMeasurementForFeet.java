package com.measurement;
import java.util.Objects;

public class QuantityMeasurementForFeet<E>{
    private int feet;
    private int inch;
    public QuantityMeasurementForFeet() {
        this.feet = feet;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurementForFeet<?> that = (QuantityMeasurementForFeet<?>) o;
        return feet == that.feet;
    }



    public boolean valueCheck(E value1, E value2) {
        return(Objects.equals(value1, value2));
    }

    public int conversionFeetToInch(int feetValue) {
        inch = feetValue * 12;
        return inch;
    }

}
