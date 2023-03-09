package com.yao.template.impl;

import java.util.HashMap;
import java.util.Map;

import com.yao.template.NetMall;

public class JDNetMall extends NetMall {

    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected Boolean login(String uId, String uPwd) {
        System.out.println("登录JD---------------");
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        System.out.println("添加信息------------");
        HashMap<String, String> map = new HashMap<>();
        map.put("JD", "00001");
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        System.out.println("获取信息---------");
        return goodsInfo.get("JD");
    }
}
