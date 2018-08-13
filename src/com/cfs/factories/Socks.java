package com.cfs.factories;

import com.cfs.upgrades.Upgrade;

import javax.swing.*;

public class Socks extends Clothing {

    public Socks() {
        super("Socks", 10, .1, .1,
                new ImageIcon("images\\Socks.png"));
    }

    @Override
    public void setUpgrades(){
        for(int i = 25; i <= 100; i += 25){
            upgrades.add(new Upgrade(2, i));
        }
        for(int i = 150; i <= 500; i += 50){
            upgrades.add(new Upgrade(2, i));
        }
        for(int i = 600; i < 1000; i++){
            upgrades.add(new Upgrade(2, i));
        }
    }
}
