package org.zhudro.fiftyone;

import java.math.BigDecimal;

/**
 * Created by mikalai on 02.02.16.
 */
public class BmiFormula {

    private static  BigDecimal UNDERWEIGHT_LIMIT = new BigDecimal("18.5");
    private static  BigDecimal NORMAL_WEIGHT_LOWER_LIMIT = new BigDecimal("18.5");
    private static  BigDecimal NORMAL_WEIGHT_UPPER_LIMIT = new BigDecimal("24.9");
    private static  BigDecimal OVERWEIGHT_LOWER_LIMIT = new BigDecimal("25");
    private static  BigDecimal OVERWEIGHT_UPPER_LIMIT = new BigDecimal("29.9");
    private static  BigDecimal OBESE_LOWER_LIMIT = new BigDecimal("30");




    public static void main(String[] args) {
        int weightKg =ConsoleUtil.getPositiveIntegerFromConsole("What is your weight in kg? ");
        int heightCm =ConsoleUtil.getPositiveIntegerFromConsole("What is your height in cm? ");
        BigDecimal weight = BigDecimal.valueOf(weightKg);
        BigDecimal heightM = BigDecimal.valueOf(heightCm).divide(BigDecimal.valueOf(100));

        BigDecimal bmi = weight.divide(heightM.multiply(heightM),2,BigDecimal.ROUND_HALF_UP);
        System.out.println(bmi);


        if(bmi.compareTo(UNDERWEIGHT_LIMIT)<=-1){
            System.out.println("You are underweight");
        }

        if(bmi.compareTo(OBESE_LOWER_LIMIT)>=1){
            System.out.println("You are obese");
        }

        if(bmi.compareTo(NORMAL_WEIGHT_LOWER_LIMIT)>=1 && bmi.compareTo(NORMAL_WEIGHT_UPPER_LIMIT)<=-1){
            System.out.println("You have normal weight");
        }

        if(bmi.compareTo(OVERWEIGHT_LOWER_LIMIT)>=1 && bmi.compareTo(OVERWEIGHT_UPPER_LIMIT)<=-1){
            System.out.println("You are overweight");
        }
    }


}
