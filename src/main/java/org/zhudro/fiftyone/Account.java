package org.zhudro.fiftyone;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class Account {
    private long principalAmount;
    private BigDecimal rate;
    private int years;

    public Account(long principalAmount,BigDecimal rate, int years) {
        this.principalAmount=principalAmount;
        this.rate = rate;
        this.years = years;
    }

    public long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getRateFormatted(){
        return rate.toPlainString()+"%";
    }

    public BigDecimal getRateAsPerentage(){
        return rate.divide(BigDecimal.valueOf(100));
    }
}
