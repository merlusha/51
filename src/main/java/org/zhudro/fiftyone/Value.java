package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public class Value {
    private double number;
    private MetricSystem system;

    private Value (double number, MetricSystem system) {
        this.number = number;
        this.system = system;
    }

    public static Value from (double number, MetricSystem system){
        return new Value(number,system);
    }

    public double getNumber() {
        return number;
    }

    public MetricSystem getSystem() {
        return system;
    }

    @Override
    public String toString() {
        return number + (system==MetricSystem.IMPERIAL? "f":"m");
    }

    public Value multipy(Value value){
        if(this.system!=value.system){
            throw new IllegalArgumentException("Bath values should be in one metric system");
        }else{
            return new Value(number*value.number,system);
        }
    }

    public  static Value convertSquareToOtherMetricSystem (Value value){
        if(MetricSystem.IMPERIAL.equals(value.getSystem())){
            return  Value.from(value.number * RectangularRoomArea.FEET_AREA_TO_METRIC_AREA_FACTOR, MetricSystem.METRIC);
        }else{
            return  Value.from(value.number / RectangularRoomArea.FEET_AREA_TO_METRIC_AREA_FACTOR, MetricSystem.METRIC);
        }

    }
}
