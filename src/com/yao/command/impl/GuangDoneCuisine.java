package com.yao.command.impl;

import com.yao.command.ICook;
import com.yao.command.ICuisine;

public class GuangDoneCuisine implements ICuisine {
    private ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }
}
