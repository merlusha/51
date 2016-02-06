package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public class ConsoleUtil {

    public static int getPositiveIntegerFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string) || !StringUtils.isNumber(string) || Integer.valueOf(string) < 0 ){
            System.out.print(prompt);
            string = readFromConsole();
        }
        return  Integer.valueOf(string);
    }

    public static int getIntegerFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string) || !StringUtils.isNumber(string)  ){
            System.out.print(prompt);
            string = readFromConsole();
        }
        return  Integer.valueOf(string);
    }

    public static int getPositiveIntegerFromConsoleInRange(String prompt,int lowerLimit,int upperLimit){
        String string = null;
        while (StringUtils.isEmpty(string) || !StringUtils.isNumber(string) || Integer.valueOf(string)<lowerLimit || Integer.valueOf(string)>upperLimit){
            System.out.print(prompt);
            string = readFromConsole();
        }
        return  Integer.valueOf(string);
    }

    public static Value getPositiveIntegerFromConsoleFeetOrMeters(String prompt){

        while(true){

            System.out.print(prompt);

            String string = readFromConsole();

            if (StringUtils.isEmpty(string) || string.length()<=1) {
                continue;
            }
            MetricSystem metricSystem = MetricSystem.from(string.charAt(string.length() - 1));


            if(metricSystem==null){
                continue;
            }
            String numberPart = string.substring(0,string.length()-1);


            if( !StringUtils.isNumber(numberPart) || Integer.valueOf(numberPart) < 0){
                continue;
            }

            return Value.from(Integer.valueOf(numberPart),metricSystem);
        }



    }

    private static boolean toBool(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String s = str.toLowerCase();
        switch (s) {
            case "true":return true;
            case "false":return false;
            case "yes":return true;
            case "no":return false;
            case "y":return true;
            case "n":return false;
        }
        return false;
    }

    public static String getStringFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string)){
            System.out.print(prompt);
            string = readFromConsole();
        }
        return  string;
    }

    public static boolean getBoolFromConsole(String str){
        return toBool(getStringFromConsole(str,"true","false","yes","no","y","n"));
    }

    public static String getMaskedStringFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string)){
            System.out.print(prompt);
            char[] password=  System.console().readPassword();
            string = new String(password);
        }
        return  string;
    }

    private static String readFromConsole() {
        return System.console().readLine();
    }

    public static String getStringFromConsole(String prompt, String ... choices) {
        String string = null;
        while (StringUtils.isEmpty(string) || !contains(string,choices)){
            System.out.print(prompt);
            string = readFromConsole();
        }
        return  string;
    }
    private static boolean contains(String choice,String ... choices){
        for (String s:choices){
            if(s.equalsIgnoreCase(choice)){
                return true;
            }
        }
        return false;
    }
}
