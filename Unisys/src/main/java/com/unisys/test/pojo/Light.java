package com.unisys.test.pojo;

import com.unisys.test.enums.LightColour;
import com.unisys.test.enums.LightStatus;

/**
 * Created by dev on 14/07/15.
 */
public class Light {
    private int number;
    private LightColour colour;
    private LightStatus status;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LightColour getColour() {
        return colour;
    }

    public void setColour(LightColour colour) {
        this.colour = colour;
    }

    public LightStatus getStatus() {
        return status;
    }

    public void setStatus(LightStatus status) {
        this.status = status;
    }

    public void printLightStatus() {
        System.out.println("Light " + this.getNumber() + " " + this.getColour() + " " + this.getStatus());
    }

    public Light(int number, LightColour colour, LightStatus status) {
        this.number = number;
        this.colour = colour;
        this.status = status;
    }

    public Light() {
    }
}