package org.zhudro.fiftyone;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikalai on 03.02.16.
 */
public class NumberToNamesArray {
    public static void main(String[] args) {
        int month = ConsoleUtil.getPositiveIntegerFromConsoleInRange("Please enter month number? ",1,12);

        String  [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println(month+" month is:"+months[month-1]);
    }

}

