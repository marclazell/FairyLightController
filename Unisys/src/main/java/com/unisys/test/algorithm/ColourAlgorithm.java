package com.unisys.test.algorithm;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.unisys.test.enums.LightColour;
import com.unisys.test.pojo.FairyLightLength;
import com.unisys.test.pojo.Light;

import java.util.List;

/**
 * Created by dev on 14/07/15.
 */
public class ColourAlgorithm extends Algorithm {

    private static final int TIME = 1000;

    public static final String NAME = "COLOUR";

    private static Predicate<Light> checkColour(final LightColour lc) {
        return new Predicate<Light>() {
            @Override
            public boolean apply(Light l) {
                return l.getColour().equals(lc);
            }
        };
    }

    @Override
    public void run(FairyLightLength f) {

        // filter list
        List<Light> filteredRed = Lists.newArrayList(Iterables.filter(f.getFairyLights(), checkColour(LightColour.RED)));
        List<Light> filteredGreen = Lists.newArrayList(Iterables.filter(f.getFairyLights(), checkColour(LightColour.GREEN)));
        List<Light> filteredWhite = Lists.newArrayList(Iterables.filter(f.getFairyLights(), checkColour(LightColour.WHITE)));

        // turn all red on
        for (Light r : filteredRed) {
            turnLightOn(r);
        }

        for (Light g : filteredGreen) {
            turnLightOn(g);
        }

        for (Light w : filteredWhite) {
            turnLightOn(w);
        }

        wait(TIME);

        for (Light a : f.getFairyLights()) {
            turnLightOff(a);
        }
    }
}
