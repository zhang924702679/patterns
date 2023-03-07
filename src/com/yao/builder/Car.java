package com.yao.builder;

public class Car {

    private String engine = "普通标准的发动机";

    private String gear = "普通标准的齿轮";

    private String door = "普通标准的车门";

    private String wheel = "普通标准的轮胎";

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public Car() {

    }

    public Car(String engine, String gear, String door, String wheel) {
        this.engine = engine;
        this.gear = gear;
        this.door = door;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                ", door='" + door + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
