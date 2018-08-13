package com.cfs.upgrades;

public class Upgrade {

    private double factor;
    private int upgradeNumber;

    public Upgrade(double factor, int upgradeNumber){
        this.factor = factor;
        this.upgradeNumber = upgradeNumber;
    }

    public double getFactor(){
        return factor;
    }
    public int getUpgradeNumber(){
        return upgradeNumber;
    }
}
