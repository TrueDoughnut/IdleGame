package com.cfs.factories;

import com.cfs.upgrades.Upgrade;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Clothing {

    private final String name;

    //math behind game
    private int startingPrice;
    private final double increaseFactor;
    private int count;
    private double production;

    public Clothing(String name, int startingPrice, double increaseFactor, double production,
                    ImageIcon image){
        this.name = name;
        this.startingPrice = startingPrice;
        this.increaseFactor = increaseFactor;
        this.production = production;

        this.image = image;

        setUpgrades();
        for(int i = 1000; i <= 20000; i += 100){
            upgrades.add(new Upgrade(2, i));
        }
    }

    public int getPrice(){
        return (int)Math.floor(startingPrice + startingPrice * count * increaseFactor);
    }

    public int getCount(){
        return count;
    }
    public int increment(){
        return ++count;
    }

    public double getProduction(){
        return production * getCount();
    }
    public double upgradeProduction(double factor){
        return production * factor;
    }

    //graphics processing
    private ImageIcon image;

    public ImageIcon getImage(){
        return image;
    }

    //setting up upgrades
    ArrayList<Upgrade> upgrades = new ArrayList<>();

    public abstract void setUpgrades();
}
