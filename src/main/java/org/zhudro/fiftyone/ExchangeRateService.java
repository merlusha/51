package org.zhudro.fiftyone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mikalai on 26.01.16.
 */
public class ExchangeRateService {


    public static void main(String[] args)  {
        System.out.println(ExchangeRateService.getRate("CZK"));
        System.out.println(ExchangeRateService.getRate("CAD"));
        System.out.println(ExchangeRateService.getRate("DKK"));
    }

    public static final String EXCHANGE_RATE_SERVICE_URL = "http://api.fixer.io/latest";

    public static BigDecimal getRate(String isoCode){
        ExchangeRateService service = new ExchangeRateService();
        String json = service.getJsonString();
        int isoCodeStart=json.indexOf(isoCode);
        int exchangeRateStart =json.indexOf(":",isoCodeStart);
        int exchangeRateEnd =json.indexOf(",",exchangeRateStart);

        String exchangeRate = json.substring(exchangeRateStart+1,exchangeRateEnd);

        if(exchangeRate!=null || exchangeRate.length()>0){
            return new BigDecimal(exchangeRate);
        }

        return null;
    }


    private String getJsonString ()  {

        URL url = null;
        StringBuilder sb = new StringBuilder();
        try {
            url = new URL(EXCHANGE_RATE_SERVICE_URL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                sb.append(inputLine);
            }

            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return sb.toString();
    }

}
