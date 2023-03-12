package com.yao.iterator;

import com.yao.iterator.impl.ARestaurantMenu;


//迭代器设计模式的本质 还是利用了java自带的的迭代器
//向外部暴露统一的方法 用户获取迭代器  外部只需要关注迭代器的使用 不需要关注迭代器的生成
public class IteratorTest {

    public static void main(String[] args) {
        ARestaurantMenu aMenu = new ARestaurantMenu();
        Waitress waitress = new Waitress();

        waitress.printMenu(aMenu);
    }
}
