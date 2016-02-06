package org.zhudro.fiftyone;

import static java.lang.System.*;
import static org.zhudro.fiftyone.ConsoleUtil.*;

/**
 * Created by mikalai on 06.02.16.
 */
public class CarIssueTroubleshooter {
    public static void main(String[] args) {

        if (getBoolFromConsole("Is your car silent when you turn the key? ")) {
            if (getBoolFromConsole("Are the battery terminals carroded? ")) {
                out.println("Clean terminals and try starting again.");
            } else {
                out.println("Replace cables and try starting again.");
            }
        } else {
            if (getBoolFromConsole("Does the car make a clicking noise? ")) {
                out.println("Replace the battery");
            } else {
                if (getBoolFromConsole("Does the car crank up but fail to start? ")) {
                    out.println("Check spark plug connections");
                } else {
                    if (getBoolFromConsole("Does the engine start and the die? ")){
                      if(getBoolFromConsole("Does your car have fuel injections? ")){
                          out.println("Get it in the service");
                      } else{
                          out.println("Check to ensure the choke is opening and closing");
                      }
                    }
                }
            }
        }

    }


}

