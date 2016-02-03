package org.zhudro.fiftyone;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikalai on 03.02.16.
 */
public class NumberToNamesLookupTable {
    public static void main(String[] args) {
        int month = ConsoleUtil.getPositiveIntegerFromConsoleInRange("Please enter month number? ",1,12);

        Map<Integer,String> numberToMonths = new HashMap<>();
        numberToMonths.put(1,"January");
        numberToMonths.put(2,"February");
        numberToMonths.put(3,"March");
        numberToMonths.put(4,"April");
        numberToMonths.put(5,"May");
        numberToMonths.put(6,"June");
        numberToMonths.put(7,"July");
        numberToMonths.put(8,"August");
        numberToMonths.put(9,"September");
        numberToMonths.put(10,"October");
        numberToMonths.put(11,"November");
        numberToMonths.put(12,"December");


        System.out.println(month+" month is:"+numberToMonths.get(month));
    }

}

