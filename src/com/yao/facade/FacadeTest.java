package com.yao.facade;

public class FacadeTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // 启动汽车，用户并不知道引擎、车门、钥匙、中控的运作
    }
}
