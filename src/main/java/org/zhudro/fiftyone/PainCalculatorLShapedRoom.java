package org.zhudro.fiftyone;

/**
 * Created by mikalai on 25.01.16.
 */
public class PainCalculatorLShapedRoom {

    private static final int FEETS_PER_GALLON = 350;

    public static void main(String[] args) {

        int length = ConsoleUtil.getPositiveIntegerFromConsole("What is the length of the room ? ");

        int width  = ConsoleUtil.getPositiveIntegerFromConsole("What is the width of the room ? ");

        int lengthSmall = ConsoleUtil.getPositiveIntegerFromConsole("What is the length of the small part of the room ? ");

        int widthSmall = ConsoleUtil.getPositiveIntegerFromConsole("What is the width of the small part of the room ? ");

        int smallPartArea =lengthSmall*widthSmall;

        int wholeArea = length*width;

        int area = wholeArea - smallPartArea;


        int gallons = (int) Math.ceil((double) area / (double) FEETS_PER_GALLON);

        System.out.println("You will need to purchase "+gallons+ " gallons of paint to cover "+area+" square feet.");
    }
}
