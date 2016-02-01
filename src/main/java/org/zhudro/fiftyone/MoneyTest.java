package org.zhudro.fiftyone;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by mikalai on 26.01.16.
 */
public class MoneyTest {
    public static void main(String[] args) {
        BigDecimal subtotal = BigDecimal.valueOf(81);
        BigDecimal exchangeRate = new BigDecimal("137.51");


        BigDecimal price = subtotal.multiply(exchangeRate).divide(BigDecimal.valueOf(100),2, RoundingMode.HALF_EVEN);

        System.out.println(price);


    }
}
