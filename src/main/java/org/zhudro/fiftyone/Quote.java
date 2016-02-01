package org.zhudro.fiftyone;

/**
 * Created by mikalai on 23.01.16.
 */
public class Quote {
    public static void main(String[] args) {
        System.out.print("Please, enter quote: ");
        String quote = System.console().readLine();
        System.out.print("Who said it? ");
        String author = System.console().readLine();
        System.out.println(author + " says, \"" +quote+"\"");
    }
}
