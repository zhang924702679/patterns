package com.yao.builder;

public class BMWCarBuilder implements CarBuilder{

    private static Car CAR = new Car("BMW引擎", "BMW齿轮", "BMW车门", "BMW轮胎");
    @Override
    public CarBuilder initalEngine(String engine) {
        CAR.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder initalGear(String gear) {
        CAR.setGear(gear);
        return this;
    }

    @Override
    public CarBuilder initalDoor(String door) {
        CAR.setDoor(door);
        return this;
    }

    @Override
    public CarBuilder initailWheel(String wheel) {
        CAR.setWheel(wheel);
        return this;
    }

    @Override
    public Car getCar() {
        return CAR;
    }
}
