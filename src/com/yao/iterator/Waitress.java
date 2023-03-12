package com.yao.iterator;

public class Waitress {
    public void printMenu(Menu... menus) {
        for (Menu menu : menus) {
            print(menu.iterator());
        }
    }

    private void print(MenuIterator iterator) {
        MenuItem menuItem;
        while (iterator.hasNext()) {
            menuItem = iterator.next();
            System.out.println(String.format("name=%s, desc=%s, price=%s", menuItem.getName(), menuItem.getDesc(),
                    menuItem.getPrice()));
        }
    }
}
