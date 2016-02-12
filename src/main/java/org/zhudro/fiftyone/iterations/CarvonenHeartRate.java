package org.zhudro.fiftyone.iterations;

import org.zhudro.fiftyone.ConsoleUtil;

import java.math.BigDecimal;

/**
 * Created by mikalai on 12.02.16.
 */
public class CarvonenHeartRate {
    public static int start = 55;
    public static int end = 95;

    public static void main(String[] args) {
        int restingHR = 70;
        //ConsoleUtil.getPositiveIntegerFromConsole("What is your resting pulse? ");
        int age = 36;
        //ConsoleUtil.getPositiveIntegerFromConsole("How old are you? ");
        

        System.out.println("Intensity |     Rate");
        System.out.println("_________ |_________");
        for (int i = 55; i <= 95; i++) {
            System.out.printf("%2d%%       %s     %2d  %n", i, "|", targetRate(i, age, restingHR));

        }
    }

    //(((220-age)-restingHR)*intensity)+ restingHR
    private static int targetRate(int intensity, int age, int restingHR) {
        BigDecimal result = BigDecimal.valueOf(220 - age - restingHR).multiply(BigDecimal.valueOf(intensity)).divide(BigDecimal.valueOf(100));
        result = result.add(BigDecimal.valueOf(restingHR));
        return result.intValue();
    }
}
