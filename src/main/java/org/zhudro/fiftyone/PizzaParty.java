package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public class PizzaParty {
    public static void main(String[] args) {
        int peopleCount = ConsoleUtil.getPositiveIntegerFromConsole("How many people? ");
        //int pizzasCount = ConsoleUtil.getPositiveIntegerFromConsole("How many pizzas do you have? ");
        int slices =  ConsoleUtil.getPositiveIntegerFromConsole("How many slices do you want? ");

        //int slices = peopleCount/pizzasCount;
        //int leftOvers = peopleCount % pizzasCount;

        //System.out.println(peopleCount+" with "+pizzasCount+" pizzas");
        //System.out.println("Each person gets "+slices+ " pieces of pizza.");
        //System.out.println("There are "+leftOvers+ " pizzas.");

    }
}
