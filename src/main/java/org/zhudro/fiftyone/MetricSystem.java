package org.zhudro.fiftyone;

/**
 * Created by mikalai on 24.01.16.
 */
public enum MetricSystem {
    IMPERIAL('f','F'),METRIC('m','M');

    private char abbreviataions[];

    MetricSystem(char ... abbrs){
        abbreviataions = abbrs;
    }

    public char[] getAbbrs(){
        return abbreviataions;
    }

    public static MetricSystem from(char c){

        for(int i=0;i<IMPERIAL.abbreviataions.length;i++){
            if(c==IMPERIAL.abbreviataions[i]){
                return IMPERIAL;
            }
        }

        for(int i=0;i<METRIC.abbreviataions.length;i++){
            if(c==METRIC.abbreviataions[i]){
                return METRIC;
            }
        }

        return null;
    }

}
