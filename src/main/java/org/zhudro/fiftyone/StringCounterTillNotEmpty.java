package org.zhudro.fiftyone;

/**
 * Created by mikalai on 23.01.16.
 */
public class StringCounterTillNotEmpty {
    public static void main(String[] args) {
        System.out.print("Please enter string:");
        String string = System.console().readLine();
        while(string==null || string.length()==0){
            System.out.print("String is empty, please enter non empty line:");
            string = System.console().readLine();
        }

        System.out.println("You string contains "+string.length()+" characters");

    }
}
