package com.yao.chain;

import com.yao.chain.impl.Level1AuthLink;
import com.yao.chain.impl.Level2AuthLink;
import com.yao.chain.impl.Level3AuthLink;

import java.text.ParseException;
import java.util.Date;

public class ChainTest {

    public static void main(String[] args)  throws ParseException {
        //设置责任链 审批人
        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));


        authLink.doAuth("小傅哥", "1000998004813441", new Date());

        AuthService.auth("1000013", "1000998004813441");
        authLink.doAuth("小傅哥", "1000998004813441", new Date());

        AuthService.auth("1000012", "1000998004813441");
        authLink.doAuth("小傅哥", "1000998004813441", new Date());

        AuthService.auth("1000011", "1000998004813441");
        authLink.doAuth("小傅哥", "1000998004813441", new Date());
    }
}
