package org.zhudro.fiftyone;

import java.time.LocalDate;

/**
 * Created by mikalai on 24.01.16.
 */
public class DateUtil {
    public static int getCurrentYear(){
        return  LocalDate.now().getYear();
    }
}
