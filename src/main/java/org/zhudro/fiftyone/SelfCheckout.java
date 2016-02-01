package org.zhudro.fiftyone;

import org.zhudro.fiftyone.money.Money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 26.01.16.
 */
public class SelfCheckout {

    private static BigDecimal taxRate = new BigDecimal("5.5");

    public static void main(String[] args) {
        Money[] prices = new Money[3];
        int[] quantities = new int[3];

        Money subtotal = Money.eurOf("0");

        for (int i=0;i<3;i++){
            prices[i]= Money.eurOf(ConsoleUtil.getPositiveIntegerFromConsole("Enter the price of item:")+"");
            quantities[i]= ConsoleUtil.getPositiveIntegerFromConsole("Enter the quantity of item:");
        }

        for(int i=0;i<3;i++){
            subtotal=subtotal.plus(prices[i].multiply(quantities[i]));
        }

        Money tax = subtotal.percentages(taxRate);

        Money total = subtotal.plus(tax);

        System.out.println("Subtotal:"+subtotal);
        System.out.println("Tax:"+tax);
        System.out.println("Total:"+total);
    }
}
