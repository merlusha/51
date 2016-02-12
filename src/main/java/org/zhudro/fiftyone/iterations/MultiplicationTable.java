package org.zhudro.fiftyone.iterations;

/**
 * Created by mikalai on 12.02.16.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <13 ; i++) {
            for (int j = 1; j <13 ; j++) {
                System.out.printf("%3d ", i*j);

            }
            System.out.println("\n");
        }
    }
}
