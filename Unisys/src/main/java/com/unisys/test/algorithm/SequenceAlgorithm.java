package com.unisys.test.algorithm;

import com.unisys.test.pojo.FairyLightLength;
import com.unisys.test.pojo.Light;

/**
 * Created by dev on 14/07/15.
 */
public class SequenceAlgorithm extends Algorithm {

    private static final int TIME = 500;
    public static final String NAME = "SEQUENCE";

    public void run(FairyLightLength f) {
        // turn all lights on
        for (Light l : f.getFairyLights()) {
            turnLightOn(l);
        }

        // wait half second
        wait(TIME);

        // turn lights off from first to last
        for (Light l : f.getFairyLights()) {
            turnLightOff(l);
        }
    }
}
