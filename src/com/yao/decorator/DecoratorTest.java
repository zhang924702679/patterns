package com.yao.decorator;

//装饰器模式
public class DecoratorTest {

    public static void main(String[] args) {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
    }
}
