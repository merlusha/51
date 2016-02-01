package org.zhudro.fiftyone;

/**
 * Created by mikalai on 23.01.16.
 */
public class MadLib {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        String noun = System.console().readLine();
        System.out.print("Enter a verb: ");
        String verb = System.console().readLine();
        System.out.print("Enter a adjective: ");
        String adjective = System.console().readLine();
        System.out.print("Enter a adverb: ");
        String adverb = System.console().readLine();

        System.out.println("Do you "+verb +" your "+adjective+" "+noun+" "+adverb+" ? That's hilarious");
    }
}
