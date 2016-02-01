package org.zhudro.fiftyone;

import java.math.BigDecimal;

/**
 * Created by mikalai on 25.01.16.
 */
public class PaintCalculator {

    private static final int FEETS_PER_GALLON = 350;

    public static void main(String[] args) {

        int length = ConsoleUtil.getPositiveIntegerFromConsole("What is the length of the room ? ");
        int width  = ConsoleUtil.getPositiveIntegerFromConsole("What is the width of the room ? ");
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");

        int feetArea = length*width;

        //ceil is to largest
        int gallons = (int) Math.ceil((double) feetArea / (double) FEETS_PER_GALLON);

        System.out.println("You will need to purchase "+gallons+ " gallons of paint to cover "+feetArea+" square feet.");
    }
}
