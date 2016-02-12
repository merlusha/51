package org.zhudro.strings;

/**
 * Created by mikalai on 11.02.16.
 */
public class StringUtil {
    public static String replace(String word, char gone, char here) {
        char[] cArray = word.toCharArray();
        for (int i = 0; i <cArray.length ; i++) {
            if(cArray[i]==gone){
                cArray[i]= here;
            }
        }
        return new String(cArray);
    }
}
