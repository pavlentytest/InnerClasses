package com.company;

public class ElectroCar extends Car implements Chargable{
    private int voltage;

    @Override
    public void doCharge() {
        System.out.println("Charging...");
    }
}
