package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class SimpleInterest {
    public static void main(String[] args) {

        Account account = AccountInput.constructAccountFromCommandLine();

        for(int year=1;year<=account.getYears();year++) {

            BigDecimal simpleInterest = AccountInterestCalculator.calculateSimpleInterestOnYear(account,year);
            Money simpleInterestMoney = Money.usdOf(simpleInterest);

            System.out.println("After " + year + " years at " + account.getRateFormatted() + "% the investment will be worth " + simpleInterestMoney);
        }

        System.out.println("\nAfter " + account.getYears() + " years at " + account.getRateFormatted() + " the final investment will be worth " + AccountInterestCalculator.calculateSimpleInterest(account));
    }



}
