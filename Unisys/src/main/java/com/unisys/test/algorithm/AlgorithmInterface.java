package com.unisys.test.algorithm;

import com.unisys.test.enums.LightStatus;
import com.unisys.test.pojo.Light;

/**
 * Created by dev on 14/07/15.
 */
public interface AlgorithmInterface {
    void turnLightOn(Light l);
    void turnLightOff(Light l);
    void changeLightStatus(Light l, LightStatus s);
    void wait(int waitTime);
}
