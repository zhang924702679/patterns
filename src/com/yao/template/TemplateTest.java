package com.yao.template;

import com.yao.template.impl.JDNetMall;

public class TemplateTest {

    //模板模式测试类

    public static void main(String[] args) {
        JDNetMall jd = new JDNetMall("我是JD", "11111");
        String s = jd.generateGoodsPoster("9999999");
        System.out.println(s);

    }
}
