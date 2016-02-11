package org.zhudro.fiftyone.iterations;

import org.zhudro.fiftyone.ConsoleUtil;

import java.util.Arrays;

/**
 * Created by mikalai on 11.02.16.
 */
public class AddingNumbers {
    public static void main(String[] args) {
        int iterations = ConsoleUtil.getPositiveIntegerFromConsole("Enter number of repetitions: ");
        int numbers [] = new int[iterations];
        for (int i = 0; i < iterations ; i++) {
            int number = ConsoleUtil.getPositiveIntegerFromConsole("Please enter number: ");
            numbers[i] = number;
        }
        System.out.println("Sum of entered numbers is: "+Arrays.stream(numbers).sum());
    }

}
