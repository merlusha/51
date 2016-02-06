package org.zhudro.fiftyone.functions;

import org.zhudro.fiftyone.ConsoleUtil;

import java.util.Arrays;

/**
 * Created by mikalai on 06.02.16.
 */
public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println("Enter wtwo strings and I will tell you if they are anagrams:");
        String first = ConsoleUtil.getStringFromConsole("Enter the first string: ");
        String second = ConsoleUtil.getStringFromConsole("Enter the second string: ");

        if (isAnagram(first, second)) {
            System.out.println("\"" + first + "\"" + " and " + "\"" + second + "\"" + " are anagrams");
        } else {
            System.out.println("\"" + first + "\"" + " and " + "\"" + second + "\"" + " not are anagrams");
        }
    }

    public static boolean isPolyndrome(String first, String second) {
        if (first == null || first.isEmpty()) {
            return false;
        }
        if (second == null || second.isEmpty()) {
            return false;
        }

        if (!(first.length() == second.length())) {
            return false;
        } else {
            int count = first.length();
            for (int i = 0; i < count; i++) {
                if (first.charAt(i) != second.charAt(count - i - 1)) {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean isAnagram(String first, String second) {
        if (first == null || first.isEmpty()) {
            return false;
        }
        if (second == null || second.isEmpty()) {
            return false;
        }

        if (!(first.length() == second.length())) {
            return false;
        } else {
            char [] firstChars= first.toCharArray();
            char [] secondChars= second.toCharArray();
            Arrays.sort(firstChars);
            Arrays.sort(secondChars);
            return Arrays.equals(firstChars,secondChars);
        }
    }
}
