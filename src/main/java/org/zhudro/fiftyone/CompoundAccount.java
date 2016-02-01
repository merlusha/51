package org.zhudro.fiftyone;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.02.16.
 */
public class CompoundAccount extends Account {
    private int timesCompound;

    public CompoundAccount(long principalAmount, BigDecimal rate, int years) {
        super(principalAmount, rate, years);
    }

    public int getTimesCompound() {
        return timesCompound;
    }

    public void setTimesCompound(int timesCompound) {
        this.timesCompound = timesCompound;
    }

}
