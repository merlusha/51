package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by mikalai on 26.01.16.
 */
public class MoneyTest {
    public static void main(String[] args) {
       Money amount = Money.usdOf(10);
        System.out.println(amount.percentages(new BigDecimal("5.5")));

    }
}
