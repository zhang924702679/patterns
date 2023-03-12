package com.yao.iterator.impl;

import com.yao.iterator.MenuItem;
import com.yao.iterator.MenuIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ARestaurantMenuIterator implements MenuIterator {

    private ArrayList<MenuItem> menuItems;
    private Iterator<MenuItem> iterator;

    public ARestaurantMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        iterator = menuItems.iterator();
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
