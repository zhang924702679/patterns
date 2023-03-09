package com.yao.template;

import java.util.Map;

public abstract class NetMall {

    //定义抽象类 声明方法 方法内部固定好执行逻辑
    String uId;   // 用户ID
    String uPwd;  // 用户密码

    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }

    public String generateGoodsPoster(String skuUrl) {
        if (!login(uId, uPwd)) {
            return null;
        }
        Map<String, String> reptile = reptile(skuUrl);
        return createBase64(reptile);
    }
    protected abstract Boolean login(String uId, String uPwd);

    // 爬虫提取商品信息(登录后的优惠价格)
    protected abstract Map<String, String> reptile(String skuUrl);

    // 生成商品海报信息
    protected abstract String createBase64(Map<String, String> goodsInfo);

}
