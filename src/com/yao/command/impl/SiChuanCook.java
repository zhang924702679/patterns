package com.yao.command.impl;

import com.yao.command.ICook;

public class SiChuanCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("四川厨师，烹饪川菜，中国最有特色的菜系，也是民间最大菜系。");
    }
}
