package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public class RectangularRoomAreaChoice {
    public static void main(String[] args) {
        Value length = ConsoleUtil.getPositiveIntegerFromConsoleFeetOrMeters("What is the length of the room?");
        Value width = ConsoleUtil.getPositiveIntegerFromConsoleFeetOrMeters("What is the width of the room?");

        Value area = length.multipy(width);

        System.out.println("Area of the room is "+area+"^2");
        System.out.println("Area of the room is "+Value.convertSquareToOtherMetricSystem(area)+"^2");
    }
}
