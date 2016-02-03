package org.zhudro.fiftyone;

/**
 * Created by mikalai on 02.02.16.
 */
public class PasswordValidator {
    private static String KNOWN_PASSWORD="abc$123";
    public static void main(String[] args) {

        String password = ConsoleUtil.getMaskedStringFromConsole("What is the password? ");

        if(KNOWN_PASSWORD.equals(password)){
            System.out.println("Welcome");
        }else{
            System.out.println("I do not know you!");
        }
    }
}
