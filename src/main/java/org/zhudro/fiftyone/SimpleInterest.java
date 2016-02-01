package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class SimpleInterest {
    public static void main(String[] args) {

        int principalAmount = ConsoleUtil.getPositiveIntegerFromConsole("Enter the principal:");
        String rateStr = ConsoleUtil.getStringFromConsole("Enter the rate of interest:");
        int years = ConsoleUtil.getPositiveIntegerFromConsole("Enter the number of years:");

        BigDecimal rate= new  BigDecimal (rateStr);


        for(int year=1;year<=years;year++) {

            BigDecimal simpleInterest = calculateSimpleInterest(principalAmount, rate, year);
            Money simpleInterestMoney = Money.usdOf(simpleInterest);

            System.out.println("After " + year + " years at " + rate.toPlainString() + "% the investment will be worth " + simpleInterestMoney);
        }

        System.out.println("\nAfter " + years + " years at " + rate.toPlainString() + "% the final investment will be worth " + calculateSimpleInterest(principalAmount, rate, years));
    }

    private static BigDecimal calculateSimpleInterest(int principalAmount,BigDecimal rate,int years){
        BigDecimal principal = BigDecimal.valueOf(principalAmount);
        return    principal.multiply(BigDecimal.ONE.add(rate.multiply(BigDecimal.valueOf(years)).divide(BigDecimal.valueOf(100))));
    }
}
