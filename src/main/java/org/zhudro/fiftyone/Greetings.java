package org.zhudro.fiftyone;

/**
 * Created by mikalai on 23.01.16.
 */
public class Greetings {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        System.out.println("Hello, "+System.console().readLine()+", nice to meet you!");
    }
}
