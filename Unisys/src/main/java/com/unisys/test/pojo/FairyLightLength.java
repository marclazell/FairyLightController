package com.unisys.test.pojo;

import com.unisys.test.enums.LightColour;
import com.unisys.test.enums.LightStatus;

import java.util.ArrayList;

/**
 * Created by dev on 14/07/15.
 */
public class FairyLightLength {

    private ArrayList<Light> fairyLights;

    public ArrayList<Light> getFairyLights() {
        return fairyLights;
    }

    public void setFairyLights(ArrayList<Light> fairyLights) {
        this.fairyLights = fairyLights;
    }

    public void getLight(int pos) {
        this.getFairyLights().get(pos);
    }

    public FairyLightLength(ArrayList<Light> fairyLights) {
        this.fairyLights = fairyLights;
    }

    public FairyLightLength(int size) {
        this.fairyLights = new ArrayList<Light>(size);

        int counter = 0;

        while (counter < size) {
            for (LightColour colour : LightColour.values()) {
                if (counter >= size) {
                    break;
                }
                int lightNumber = counter + 1;
                this.fairyLights.add(new Light(lightNumber, colour, LightStatus.OFF));
                counter++;
            }
        }
    }

    public FairyLightLength() {
    }
}
