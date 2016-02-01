package org.zhudro.fiftyone;

/**
 * Created by mikalai on 23.01.16.
 */
public class MultiplyGreetings {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = System.console().readLine();
        switch (name){
            case "Mikalai":
                System.out.println("Hello,"+name+" , it was ages since I saw you last time");
                break;
            case "Ramirez":
                System.out.println("Buenos dias ,"+name);
                break;
            default:
                System.out.println("Nice to meet you "+name);
        }

    }
}
