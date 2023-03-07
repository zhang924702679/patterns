package com.yao.builder;

public interface CarBuilder {

    // 安装引擎
    CarBuilder initalEngine(String engine);

    // 安装齿轮
    CarBuilder initalGear(String gear);

    // 安装车门
    CarBuilder initalDoor(String door);

    // 安装轮胎
    CarBuilder initailWheel(String wheel);

    // 获得构建后的汽车
    Car getCar();
}
