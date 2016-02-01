package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 26.01.16.
 */
public class CurrencyConversionMultiplyExchangeRates {
    public static void main(String[] args) {
        int amount = ConsoleUtil.getPositiveIntegerFromConsole("How many euros are you exchanging? ");
        String isoCode = ConsoleUtil.getStringFromConsole("To which currency you wish to convert:");

        Money moneyAmount = Money.eurOf(amount);
        BigDecimal rate = ExchangeRateService.getRate(isoCode);

        Money exchanged = moneyAmount.convertTo2(rate,isoCode);

        System.out.println(exchanged);

    }
}
