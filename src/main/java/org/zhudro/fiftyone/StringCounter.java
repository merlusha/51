package org.zhudro.fiftyone;

/**
 * Created by mikalai on 23.01.16.
 */
public class StringCounter {
    public static void main(String[] args) {
        System.out.print("Please enter string:");
        String string = System.console().readLine();
        System.out.println("You string contains:" + string.length() + " characters");
    }
}
