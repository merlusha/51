package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public class StringUtils {

    public static boolean isEmpty(String string) {
        return string == null || string.length() == 0;
    }

    public static boolean isNumber(String s){
        int start = 0;
        if(s.charAt(0)=='-'){
            start =1;
        }
        for (int i = start; i <s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
