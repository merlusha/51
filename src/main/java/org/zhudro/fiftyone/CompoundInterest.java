package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class CompoundInterest {
    public static void main(String[] args) {
        CompoundAccount account = AccountInput.constructCompaundAccountFromCommandLine();
        BigDecimal compoundInterest = AccountInterestCalculator.calculateCompoundInterest(account);
        Money money = Money.usdOf(compoundInterest);
        System.out.println(money);
    }
}
