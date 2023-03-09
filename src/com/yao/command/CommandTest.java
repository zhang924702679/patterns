package com.yao.command;

import com.yao.command.impl.GuangDoneCuisine;
import com.yao.command.impl.ShanDongCook;

public class CommandTest {

    public static void main(String[] args) {
        GuangDoneCuisine guangDoneCuisine = new GuangDoneCuisine(new ShanDongCook());
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.add(guangDoneCuisine);
        xiaoEr.placeOrder();

    }
}
