package com.unisys.test.enums;

/**
 * Created by dev on 14/07/15.
 */
public enum AlgorithmName {
    SEQUENCE("sequence"), COLOUR("colour"), ALTERNATE("alternate");

    private String algorithmName;

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    AlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    AlgorithmName() {

    }
}
