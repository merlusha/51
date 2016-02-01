package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 26.01.16.
 */
public class CurrencyConversion {
    public static void main(String[] args) {
        int amount = ConsoleUtil.getPositiveIntegerFromConsole("How many euros are you exchanging? ");
        String exchangeRate = ConsoleUtil.getStringFromConsole("What is exchange rate? ");

        Money moneyAmount = Money.eurOf(amount);
        BigDecimal rate = new BigDecimal(exchangeRate);

        Money exchanged = moneyAmount.convertTo(rate);

        System.out.println(exchanged);

    }
}
