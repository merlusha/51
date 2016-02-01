package org.zhudro.fiftyone.money;

/**
 * Created by mikalai on 26.01.16.
 */
public enum Currency {
    EUR("€"),USD ("$"),AUD,CHF,GBP,PLN,RUB;
    private String code;

    Currency(String code){
        this.code=code;
    }

    Currency(){
        this.code="";
    }

    public String getCode() {
        return code;
    }
}
