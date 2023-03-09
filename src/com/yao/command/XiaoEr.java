package com.yao.command;

import java.util.ArrayList;
import java.util.List;

public class XiaoEr {

    private List<ICuisine> list = new ArrayList<>();

    public void add(ICuisine iCuisine) {
        list.add(iCuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine iCuisine : list) {
            iCuisine.cook();
        }
        list.clear();
    }
}
