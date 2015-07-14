package com.unisys.test.algorithm;

import com.unisys.test.enums.LightStatus;
import com.unisys.test.pojo.FairyLightLength;
import com.unisys.test.pojo.Light;

/**
 * Created by dev on 14/07/15.
 */
public class Algorithm implements AlgorithmInterface {

    private static String NAME;

    @Override
    public void turnLightOn(Light l) {
        changeLightStatus(l, LightStatus.ON);
    }

    @Override
    public void turnLightOff(Light l) {
        changeLightStatus(l, LightStatus.OFF);
    }

    @Override
    public void changeLightStatus(Light l, LightStatus s) {
        l.setStatus(s);
        l.printLightStatus();
    }

    @Override
    public void wait(int waitTime) {
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(FairyLightLength f) {

    }



}
