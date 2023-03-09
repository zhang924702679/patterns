package com.yao.command.impl;

import com.yao.command.ICook;

public class ShanDongCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
