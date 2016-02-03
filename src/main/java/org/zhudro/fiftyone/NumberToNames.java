package org.zhudro.fiftyone;

import org.zhudro.fiftyone.ConsoleUtil;

/**
 * Created by mikalai on 03.02.16.
 */
public class NumberToNames {
    public static void main(String[] args) {
        int month = ConsoleUtil.getPositiveIntegerFromConsoleInRange("Please enter month number? ",1,12);

        String monthDesc = null;

        switch (month){
            case 1:monthDesc="January";break;
            case 2:monthDesc="February";break;
            case 3:monthDesc="March";break;
            case 4:monthDesc="April";break;
            case 5:monthDesc="May";break;
            case 6:monthDesc="June";break;
            case 7:monthDesc="July";break;
            case 8:monthDesc="August";break;
            case 9:monthDesc="September";break;
            case 10:monthDesc="October";break;
            case 11:monthDesc="November";break;
            case 12:monthDesc="December";break;
            default:
                monthDesc="Not specified";
        }
        System.out.println(month+" month is:"+monthDesc);
    }

}
