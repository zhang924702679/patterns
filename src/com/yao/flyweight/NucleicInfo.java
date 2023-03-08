package com.yao.flyweight;

public class NucleicInfo {

    private Integer id;

    // 核酸医院网点名称
    private String name;

    public NucleicInfo() {
    }

    public NucleicInfo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NucleicInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
