package org.zhudro.fiftyone;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class AccountInput {
    public static Account constructAccountFromCommandLine(){

        int principalAmount = ConsoleUtil.getPositiveIntegerFromConsole("Enter the principal:");
        String rateStr = ConsoleUtil.getStringFromConsole("Enter the rate of interest:");
        int years = ConsoleUtil.getPositiveIntegerFromConsole("Enter the number of years:");

        BigDecimal rate= new  BigDecimal (rateStr);

        Account account = new Account(principalAmount,rate,years);

        return account;
    }

    public static CompoundAccount constructCompaundAccountFromCommandLine(){
        Account  account = constructAccountFromCommandLine();
        CompoundAccount compoundAccount = new CompoundAccount(account.getPrincipalAmount(),account.getRate(),account.getYears());
        int timesCompund = ConsoleUtil.getPositiveIntegerFromConsole("Enter the number of times the interest is compound per year:");
        compoundAccount.setTimesCompound(timesCompund);
        return compoundAccount;
    }
}
