package com.unisys.testing;

import com.unisys.test.algorithm.Algorithm;
import com.unisys.test.algorithm.SequenceAlgorithm;
import com.unisys.test.enums.LightColour;
import com.unisys.test.enums.LightStatus;
import com.unisys.test.pojo.Light;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;

/**
 * Created by dev on 15/07/15.
 */
public class SequenceAlgorithmTest {

    private Light l;

    private Algorithm a;

    @Before
    public void setUp() {
        l = new Light(1, LightColour.RED, LightStatus.OFF);
        a = new SequenceAlgorithm();
    }

    @Test
    public void turnLightOn() {
        a.turnLightOn(l);
        assertSame(l.getStatus(), LightStatus.ON);
    }


}
