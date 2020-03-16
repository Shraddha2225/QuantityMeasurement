package com.measurement;
import java.util.Objects;

public class QuantityMeasurement<E>{
   /* private static int type;*/
    private int feet;
    private int inch;
    private int yards;

    public  enum UnitType {
        FEET,INCH, FEETTOINCH, INCHTOFEET, YARDSTOFEET, FEETTOYARDS,
        INCHTOYARDS, YARDSTOINCH,INCHTOCENTIMETER,CENTIMETERTOINCH,GALLONTOLITRES,LITRETOMILLILITRE

    }

    public QuantityMeasurement() {
        this.feet = feet;
        this.inch = inch;

    }

    public boolean valueCheck(E value1, E value2) {
        return(Objects.equals(value1, value2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement<?> that = (QuantityMeasurement<?>) o;
        return feet == that.feet &&
                inch == that.inch;
    }

    public double unitConversion(UnitType unit, double value) {
        if(unit == UnitType.FEETTOINCH) {
            return value * 12;
        }else if(unit == UnitType.FEET){
            return value;
        }else if(unit == UnitType.INCH){
            return value;
        } else if(unit == UnitType.FEETTOYARDS){
            return value / 3;
        } else if(unit == UnitType.INCHTOFEET) {
            return value / 12;
        }else if(unit == UnitType.INCHTOYARDS){
            return value /36;
        }else if(unit == UnitType.YARDSTOFEET) {
            return value * 3;
        }else if(unit == UnitType.YARDSTOINCH) {
            return value * 36;
        }else if(unit == UnitType.INCHTOCENTIMETER) {
            return value * 2.5;
        }else if(unit == UnitType.CENTIMETERTOINCH){
            return value / 2.5;
        }else if(unit == UnitType.GALLONTOLITRES){
            return value * 3.78;
        }else if (unit == UnitType.LITRETOMILLILITRE){
            return value * 1000;
        }
        return 0;
    }

}
