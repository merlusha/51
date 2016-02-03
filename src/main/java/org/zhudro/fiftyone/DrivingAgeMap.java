package org.zhudro.fiftyone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mikalai on 02.02.16.
 */
public class DrivingAgeMap {
    private static Map<String,Integer> mapCountriesToAge  = new HashMap<>();

    static {
        loadMap();
    }

    private static void loadMap(){
        try {
            List<String> lines = Files.readAllLines(Paths.get("/home/mikalai/dev/exercises/src/main/resources/driving_age.csv"));
            for(String line:lines){
                try {
                    String country = line.substring(0,line.indexOf(','));
                    Integer drivingAge =Integer.parseInt(line.substring(line.indexOf(',')+1));
                    mapCountriesToAge.put(country.toLowerCase(),drivingAge);
                }catch (Exception e){

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer getDrivingAge(String country){
        return mapCountriesToAge.get(country.toLowerCase());
    }
}
