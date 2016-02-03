package org.zhudro.fiftyone.money;

import java.math.BigDecimal;

/**
 * Created by mikalai on 26.01.16.
 */
public class Money {
    private Currency currency;
    private BigDecimal number;

    private Money(){

    }

    private Money(Currency currency,BigDecimal number){
        this.currency=currency;
        this.number=number;
    }

    public static Money eurOf(String n){
        Money money = new Money();
        money.currency=Currency.EUR;
        money.number = new BigDecimal(n);
        return money;
    }

    public static Money eurOf(int n){
        Money money = new Money();
        money.currency=Currency.EUR;
        money.number = new BigDecimal(n);
        return money;
    }

    public static Money of(String s,int n){
        Money money = new Money();
        money.currency=Currency.valueOf(s);
        money.number = new BigDecimal(n);
        return money;
    }

    public static Money usdOf(String n){
        Money money = new Money();
        money.currency=Currency.USD;
        money.number = new BigDecimal(n);
        return money;
    }

    public static Money usdOf(int n){
        Money money = new Money();
        money.currency=Currency.USD;
        money.number = new BigDecimal(n);
        return money;
    }

    public static Money usdOf(BigDecimal n){
        Money money = new Money();
        money.currency=Currency.USD;
        money.number = n;
        return money;
    }

    public Money plus(Money money){
        if (money.getCurrency()!=currency){
            throw new IllegalArgumentException("Currencies should be equal");
        }else{
            return new Money(money.getCurrency(),number.add(money.getNumber()));
        }
    }

    public Money multiply(int quantities){
        return new Money(currency,number.multiply(BigDecimal.valueOf(quantities)));
    }


    public Money percentages(BigDecimal percentages){
        return new Money(currency,number.multiply(percentages).divide(BigDecimal.valueOf(100)));
    }


    public Money convertTo(BigDecimal exchangeRate){
        return new Money(currency==Currency.EUR? currency.USD:Currency.EUR,number.multiply(exchangeRate).divide(BigDecimal.valueOf(100)));
    }

    public Money convertTo2(BigDecimal exchangeRate,String isoCode){
        return new Money(Currency.valueOf(isoCode),number.multiply(exchangeRate));
    }

    public BigDecimal getNumber() {
        return number;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return currency.getCode()+number.setScale(2,BigDecimal.ROUND_HALF_UP).toPlainString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (getCurrency() != money.getCurrency()) return false;
        return getNumber().equals(money.getNumber());

    }

    @Override
    public int hashCode() {
        int result = getCurrency().hashCode();
        result = 31 * result + getNumber().hashCode();
        return result;
    }
}
