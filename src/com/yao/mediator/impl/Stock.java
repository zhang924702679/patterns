package com.yao.mediator.impl;

import com.yao.mediator.AbstractColleague;
import com.yao.mediator.Mediator;

public class Stock extends AbstractColleague {
    private static int COMPUTER_NUM = 100;

    public Stock(Mediator mediator) {
        super(mediator);
    }

    /** 增加库存 */
    public void increaseComputer(int number) {
        COMPUTER_NUM += number;
        System.out.println("电脑的库存数量为：" + COMPUTER_NUM);
    }

    /** 减少库存 */
    public void decreaseComputer(int number) {
        COMPUTER_NUM -= number;
        System.out.println("电脑的库存数量为：" + COMPUTER_NUM);
    }

    /** 获得当前库存 */
    public int getStockNumber() {
        return COMPUTER_NUM;
    }

    /** 清理库存 */
    public void clearStock() {
        System.out.println("清理库存数量为：" + COMPUTER_NUM);
        super.mediator.stockClear();
    }
}
