package com.measurement;
import java.util.Objects;

public class QuantityMeasurement<E>{
   /* private static int type;*/
    private int feet;
    private int inch;
    private int yards;



    public QuantityMeasurement() {
        this.feet = feet;
        this.inch = inch;

    }

    public boolean valueCheck(E value1, E value2) {
        return(Objects.equals(value1, value2));
    }

    public double unitConversion(UnitType type, double value) {
        return (type.value==1.8)?value*type.value+32 :value*type.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement<?> that = (QuantityMeasurement<?>) o;
        return feet == that.feet &&
                inch == that.inch;
    }
}
