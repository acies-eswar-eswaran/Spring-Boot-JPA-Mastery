package com.mycompany.property.management.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class calculatorDTO {

    private Double numA;
    private Double numB;
    private Double numC;
    @JsonProperty("numDD")
    private Double numD;

    public Double getNumA() {
        return numA;
    }

    public void setNumA(Double numA) {
        this.numA = numA;
    }

    public Double getNumB() {
        return numB;
    }

    public void setNumB(Double numB) {
        this.numB = numB;
    }

    public Double getNumC() {
        return numC;
    }

    public void setNumC(Double numC) {
        this.numC = numC;
    }

    public Double getNumD() {
        return numD;
    }

    public void setNumD(Double numD) {
        this.numD = numD;
    }
}
