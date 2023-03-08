package com.yao.composite;

public abstract class AbstractCorp {
    public AbstractCorp() {
    }

    public AbstractCorp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    private String name = "";

    // 职员的职位
    private String position = "";

    // 职员的薪水
    private int salary = 0;

    public String getCorpInfo() {
        return String.format("姓名:%s 职位:%s 薪水:%d", name, position, salary);
    }
}
