package com.unisys.test.algorithm;

import com.unisys.test.pojo.FairyLightLength;

/**
 * Created by dev on 14/07/15.
 */
public class AlternateAlgorithm extends Algorithm {

    private static final int TIME = 30000;
    public static final String NAME = "ALTERNATE";


    public void run(FairyLightLength f) {
        long endTime = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < endTime) {
            SequenceAlgorithm s = new SequenceAlgorithm();
            s.run(f);
        }

        endTime = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < endTime) {
            ColourAlgorithm c = new ColourAlgorithm();
            c.run(f);
        }
    }
}
