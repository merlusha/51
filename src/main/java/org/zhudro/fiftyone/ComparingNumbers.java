package org.zhudro.fiftyone;

/**
 * Created by mikalai on 03.02.16.
 */
public class ComparingNumbers {
    public static void main(String[] args) {
        int[] numbers = getNonRepitingIntegersFromConsole(3);
        System.out.println("The biggest entered number is: "+max(numbers));
    }

    public static int[] getNonRepitingIntegersFromConsole(int count){
        int [] numbers = new int[count];
        String string = null;

        for(int i=0;i<count;i++) {

            while (StringUtils.isEmpty(string) || !StringUtils.isNumber(string) || isIn(Integer.valueOf(string),numbers)) {
                System.out.println("Please enter "+ (i+1) + " number");
                string = System.console().readLine();
            }
            numbers[i]=Integer.valueOf(string);
        }
        return  numbers;
    }

    private static boolean isIn(int number,int[] numbers){
        for(int i=0;i<numbers.length;i++){
            if(number==numbers[i]){
                return true;
            }
        }
        return false;
    }
    private static int max(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
}
