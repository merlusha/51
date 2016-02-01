package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public class ConsoleUtil {

    public static int getPositiveIntegerFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string) || !StringUtils.isNumber(string) || Integer.valueOf(string) < 0){
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

    public static String getStringFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string)){
            System.out.print(prompt);
            string = readFromConsole();
        }
        return  string;
    }


    private static String readFromConsole() {
        return System.console().readLine();
    }
}
