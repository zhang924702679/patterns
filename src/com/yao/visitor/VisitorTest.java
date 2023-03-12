package com.yao.visitor;

import com.yao.visitor.impl.Parent;
import com.yao.visitor.impl.Principal;


//先是谁要去查看 然后是查看谁
// 被观察者通过自己的方法 调用观察的这的观察方法 将自身信息传递给观察者 然后观察者再根据被观察者的信息和方法获得自身要想的数据
//利用观察者自身的方法void visit(被观察者)
public class VisitorTest {
    public static void main(String[] args) {
        DataView dataView = new DataView();

        System.out.println("家长");
        dataView.show(new Parent());     // 家长

        System.out.println("校长");
        dataView.show(new Principal());  // 校长
    }
}
