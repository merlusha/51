package org.zhudro.fiftyone;

/**
 * Created by mikalai on 25.01.16.
 */
public class PaintCalculatorRoundRoom {

    private static final int FEETS_PER_GALLON = 350;

    public static void main(String[] args) {
        int radius = ConsoleUtil.getPositiveIntegerFromConsole("What is the radius of the room ? ");

        int feetArea = (int) Math.ceil(radius*radius*Math.PI);
        int gallons = (int) Math.ceil((double) feetArea / (double) FEETS_PER_GALLON);

        System.out.println("You will need to purchase "+gallons+ " gallons of paint to cover "+feetArea+" square feet.");
    }



}
