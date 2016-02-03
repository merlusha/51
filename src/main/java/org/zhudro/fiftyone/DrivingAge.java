package org.zhudro.fiftyone;

/**
 * Created by mikalai on 02.02.16.
 */
public class DrivingAge {
    public static void main(String[] args) {
        String country = ConsoleUtil.getStringFromConsole("What is your country? ");
        int age =ConsoleUtil.getPositiveIntegerFromConsole("What is your age? ");
        int allowedDrivingAge = DrivingAgeMap.getDrivingAge(country);

        if(age>=allowedDrivingAge){
            System.out.println("You are  old enough to legally drive");
        }else{
            System.out.println("You are not old enough to legally drive");
        }
    }
}
