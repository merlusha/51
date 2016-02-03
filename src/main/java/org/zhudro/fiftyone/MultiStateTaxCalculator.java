package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 02.02.16.
 */
public class MultiStateTaxCalculator {
    private static String TAXED_STATE="WI";
    private static String TAXED_FULL_NAME_STATE="Wisconsin";

    private static BigDecimal CLAIRE_TAX_RATE = new BigDecimal("5.5");
    private static BigDecimal DUNN_TAX_RATE = new BigDecimal("5.5");


    private static String SECOND_TAXED_STATE="IL";
    private static String SECOND_TAXED_FULL_NAME_STATE="Illinois";

    private static BigDecimal TAX_RATE = new BigDecimal("5.5");
    private static BigDecimal SECOND_TAX_RATE = new BigDecimal("8");

    public static void main(String[] args) {
        int amount = ConsoleUtil.getPositiveIntegerFromConsole("What is the order amount? ");
        String state = ConsoleUtil.getStringFromConsole("What is the state do you live in?? ");

        Money money = Money.usdOf(amount);
        Money subtotal = money;
        Money total = subtotal;
        BigDecimal taxRate = getTaxRate(state);
        total = calculateTaxAndresult(subtotal, taxRate);
        displayTotal("The total is:" + total);
    }

    private static Money calculateTaxAndresult(Money subtotal, BigDecimal taxRate) {
        Money tax = subtotal.percentages(taxRate);
        Money total= subtotal.plus(tax);
        displayTax(subtotal, tax);
        return total;
    }

    private static BigDecimal getTaxRate(String state) {
        if(TAXED_STATE.equalsIgnoreCase(state) || TAXED_FULL_NAME_STATE.equalsIgnoreCase(state)) {
            String county = ConsoleUtil.getStringFromConsole("What is the county do you live in? ");

            if ("Claire".equals(county)) {
                return CLAIRE_TAX_RATE;
            } else if ("Dunn".equals(county)) {
                return DUNN_TAX_RATE;
            }
        }else if(SECOND_TAXED_STATE.equalsIgnoreCase(state) || SECOND_TAXED_FULL_NAME_STATE.equalsIgnoreCase(state)){
            return SECOND_TAX_RATE;
        }
        return TAX_RATE;
    }

    private static void displayTotal(String x) {
        System.out.println(x);
    }

    private static void displayTax(Money subtotal, Money tax) {
        System.out.println("The subtotal is:"+subtotal);
        System.out.println("The tax is:"+tax);
    }
}
