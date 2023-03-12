package com.yao.visitor;

public abstract  class User {

    public String name;      // 姓名
    public String identity;  // 身份；重点班、普通班 | 特级教师、普通教师、实习教师
    public String clazz;     // 班级

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    // 核心访问方法
    public abstract void accept(Visitor visitor);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", identity='" + identity + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
