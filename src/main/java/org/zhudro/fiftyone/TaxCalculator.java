package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 02.02.16.
 */
public class TaxCalculator {
    private static String TAXED_STATE="WI";
    private static String TAXED_FULL_NAME_STATE="Wisconsin";
    private static BigDecimal TAX_RATE = new BigDecimal("5.5");

    public static void main(String[] args) {
        int amount = ConsoleUtil.getPositiveIntegerFromConsole("What is the order amount? ");
        String state = ConsoleUtil.getStringFromConsole("What is the state? ");
        Money money = Money.usdOf(amount);
        Money subtotal = money;
        Money total = subtotal;

        if(TAXED_STATE.equalsIgnoreCase(state) || TAXED_FULL_NAME_STATE.equalsIgnoreCase(state)){
            Money tax = subtotal.percentages(TAX_RATE);
            total= subtotal.plus(tax);
            displayTax(subtotal, tax);
        }

        displayTotal("The total is:" + total);

    }

    private static void displayTotal(String x) {
        System.out.println(x);
    }

    private static void displayTax(Money subtotal, Money tax) {
        System.out.println("The subtotal is:"+subtotal);
        System.out.println("The tax is:"+tax);
    }
}
