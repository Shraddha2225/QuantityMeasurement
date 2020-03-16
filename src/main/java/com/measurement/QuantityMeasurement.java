package com.measurement;
import java.util.Objects;

public class QuantityMeasurement<E>{
    private int feet;
    private int inch;
    public  enum unitType{
        FEET,INCH
    }

    public QuantityMeasurement() {
        this.feet = feet;
        this.inch = inch;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement<?> that = (QuantityMeasurement<?>) o;
        return feet == that.feet &&
                inch == that.inch;
    }

    public boolean valueCheck(E value1, E value2) {
        return(Objects.equals(value1, value2));
    }

    public int unitConversion( QuantityMeasurement.unitType unit,int value) {
        if(unit == unitType.FEET) {
            return value * 12;
        } else if(unit == unitType.INCH) {
            return value / 12;
        }
        return 0;
    }

}
