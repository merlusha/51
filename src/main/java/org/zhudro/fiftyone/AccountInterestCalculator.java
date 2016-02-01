package org.zhudro.fiftyone;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class AccountInterestCalculator {
    public static BigDecimal calculateSimpleInterestOnYear(Account account,int year){
        BigDecimal principal = BigDecimal.valueOf(account.getPrincipalAmount());
        return    principal.multiply(BigDecimal.ONE.add(account.getRate().multiply(BigDecimal.valueOf(year)).divide(BigDecimal.valueOf(100))));
    }

    public static BigDecimal calculateSimpleInterest(Account account){
      return calculateSimpleInterestOnYear(account,account.getYears());
    }

    public static BigDecimal calculateCompoundInterest(CompoundAccount account){
        BigDecimal principal = BigDecimal.valueOf(account.getPrincipalAmount());
        BigDecimal part = BigDecimal.ONE.add(account.getRateAsPerentage().divide(BigDecimal.valueOf(account.getTimesCompound())));
        BigDecimal power = part.pow(account.getYears()*account.getTimesCompound());
        return principal.multiply(power);
    }
}
