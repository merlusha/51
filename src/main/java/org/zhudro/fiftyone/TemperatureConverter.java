package org.zhudro.fiftyone;

/**
 * Created by mikalai on 03.02.16.
 */
public class TemperatureConverter {

    public static final String FAHRENHEIT_ABBR = "F";
    public static final String CELISUS_ABBR = "C";

    private static String F_NAME = "Fahrenheit";
    private static String C_NAME = "Celsius";

    public static void main(String[] args) {
        String scale = ConsoleUtil.getStringFromConsole("Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit\nYour choice is: ","C","F");
        int converted = 0;

        if(CELISUS_ABBR.equals(scale)){
            int temperature = ConsoleUtil.getIntegerFromConsole("Please enter the temperature in Fahrenheit ");
            converted = convertFahrenheitToCelcius(temperature);
            System.out.println("Temperature in Celsius is "+converted);
        }else if(FAHRENHEIT_ABBR.equals(scale)){
            int temperature = ConsoleUtil.getIntegerFromConsole("Please enter the temperature in Celsius ");
            converted = convertCelciusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit is "+converted);
        }

    }

    private static int convertFahrenheitToCelcius(int temperature){
        return (temperature-32)*5/9;
    }
    private static int convertCelciusToFahrenheit(int temperature){
        return (temperature*9)/5 +32;
    }
}
