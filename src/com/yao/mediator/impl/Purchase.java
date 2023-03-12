package com.yao.mediator.impl;

import com.yao.mediator.AbstractColleague;
import com.yao.mediator.Mediator;

public class Purchase extends AbstractColleague {
    public Purchase(Mediator mediator) {
        super(mediator);
    }

    public void buyComputer(int num) {
        super.mediator.purchaseByComputer(num);
    }

    public void refuseBuyComputer() {
        System.out.println("不再采购电脑！");
    }
}
