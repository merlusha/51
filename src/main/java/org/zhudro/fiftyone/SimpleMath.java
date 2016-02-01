package org.zhudro.fiftyone;

import java.io.IOException;

/**
 * Created by mikalai on 23.01.16.
 */
public class SimpleMath {
    public static void main(String[] args) throws IOException {

        int firstNumber = getPositiveIntegerFromConsole("Please enter first integer:");
        int secondNumber = getPositiveIntegerFromConsole("Please enter second integer:");

        printResult(firstNumber,secondNumber,"+");
        printResult(firstNumber,secondNumber,"-");
        printResult(firstNumber,secondNumber,"*");
        printResult(firstNumber,secondNumber,"/");


    }
    
    private static int getPositiveIntegerFromConsole(String prompt){
        String string = null;
        while (StringUtils.isEmpty(string) || !StringUtils.isNumber(string) || Integer.valueOf(string) < 0){
            System.out.print(prompt);
            string = System.console().readLine();
        }
        return  Integer.valueOf(string);
    }

    private static void printResult(int first,int second,String operation){
        String output=null;
        int result =0;
        switch (operation){
            case "+":
                result=first+second;
                break;
            case "-":
                result=first-second;
                break;
            case "*":
                result=first*second;
                break;
            case "/":
                result=first/second;
                break;
            default:
                throw  new IllegalArgumentException("Operation "+operation+" not implemented yet");
        }
        System.out.println(output = first + " "+operation+" "+second +" = " + (result));
    }
}
