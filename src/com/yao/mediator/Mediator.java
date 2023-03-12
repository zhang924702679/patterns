package com.yao.mediator;

import com.yao.mediator.impl.Purchase;
import com.yao.mediator.impl.Sale;
import com.yao.mediator.impl.Stock;


//核心代理对象 负责各个业务类的调用 让各个业务类实现职责的单一 减少相互的耦合
public class Mediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public Mediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public void purchaseByComputer(int num) {
        int saleStatus = sale.getSaleStatus();
        // 如果销售情况不好（即：没有超过80台），则采购总数减半
        String msg = "";
        if (saleStatus <= 80) {
            num = num / 2;
            msg = "由于销售不佳，采购总数减半，";
        }
        System.out.println(msg + "原有库存电脑" + stock.getStockNumber() + "台，现采购电脑" + num + "台");
        stock.increaseComputer(num);
    }

    /** 销售电脑 */
    public void saleSellComputer(int num) {
        // 如果库存数量不足，则采购2倍的num电脑数，暂时只售卖库存中有的数量
        int stockNum;
        if ((stockNum = stock.getStockNumber()) < num) {
            purchase.buyComputer(2*num);
            num = stockNum;
        }
        stock.decreaseComputer(num);
    }

    /** 折价销售电脑 */
    public void saleOffSale() {
        System.out.println("折价销售电脑");
    }

    /** 清理库存 */
    public void stockClear() {
        sale.offSale(); // 折价销售电脑
        purchase.refuseBuyComputer(); // 不要采购电脑
    }
}
