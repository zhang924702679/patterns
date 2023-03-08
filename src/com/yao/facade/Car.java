package com.yao.facade;

public class Car {

    //和代理模式很相像
    //门面模式可以包裹接口和业务逻辑
    private Engine engine;
    private Door door;
    private DashboardDisplay display;
    private Key key;

    public Car() {
        engine = new Engine();
        door = new Door();
        display = new DashboardDisplay();
        key = new Key();
    }

    /** 汽车启动 */
    public void start() {
        if (key.key()) {
            door.door();
            engine.engine();
            display.refreshDisplay();
        }
    }
}
