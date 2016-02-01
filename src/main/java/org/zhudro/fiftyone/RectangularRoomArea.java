package org.zhudro.fiftyone;

import org.zhudro.fiftyone.ConsoleUtil;

/**
 * Created by mikalai on 24.01.16.
 */
public class RectangularRoomArea {

    public static final double FEET_AREA_TO_METRIC_AREA_FACTOR = 0.09290304;

    public static void main(String[] args) {

        int length = ConsoleUtil.getPositiveIntegerFromConsole("What is the length of the room ? ");
        int width  = ConsoleUtil.getPositiveIntegerFromConsole("What is the width of the room ? ");
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");

        int feetArea = length*width;
        double metricArea = feetArea* FEET_AREA_TO_METRIC_AREA_FACTOR;
        System.out.println("The area is \n"+feetArea+" square feet\n"+metricArea+" square meters");

    }
}
