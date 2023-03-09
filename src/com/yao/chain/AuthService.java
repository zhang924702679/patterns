package com.yao.chain;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<String, Date>();

    //拼接字符串 获取map对应的value
    public static Date queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    //向map中添加
    public static void auth(String uId, String orderId) {
        authMap.put(uId.concat(orderId), new Date());
    }
}
