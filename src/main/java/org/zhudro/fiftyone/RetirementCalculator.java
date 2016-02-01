package org.zhudro.fiftyone;


/**
 * Created by mikalai on 24.01.16.
 */
public class RetirementCalculator {

    public static void main(String[] args) {

        int currentAge = ConsoleUtil.getPositiveIntegerFromConsole("What is your current age:");
        int ageToRetire = ConsoleUtil.getPositiveIntegerFromConsole("At what age you would like to retire:");

        int currentYear = DateUtil.getCurrentYear();

        int leftYears = ageToRetire-currentAge;

        int retirementYear = currentYear + leftYears;
        if(leftYears > 0 ) {
            System.out.println("You have " + leftYears + " left until you can retire.\n"+ "It is " + currentYear + " , so you can retire in" + retirementYear);
        }else{
            System.out.println("You can already retire!");
        }
    }
}
