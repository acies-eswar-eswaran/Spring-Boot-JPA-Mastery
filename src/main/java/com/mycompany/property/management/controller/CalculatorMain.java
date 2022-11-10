package com.mycompany.property.management.controller;

public class CalculatorMain {
    public static void main(String[] args){
        CalculatorController cc = new CalculatorController();
        Double result = cc.operators("add", 12.2, 17.8);
        System.out.println(result);
    }
}
