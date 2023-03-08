package com.yao.flyweight;

public class PersonInfo {

    private String name;

    // 居住的详细地址
    private String address;

    // 核酸医院或网点唯一标识
    private Integer nucleicId;

    public PersonInfo() {
    }

    public PersonInfo(String name, String address, Integer nucleicId) {
        this.name = name;
        this.address = address;
        this.nucleicId = nucleicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNucleicId() {
        return nucleicId;
    }

    public void setNucleicId(Integer nucleicId) {
        this.nucleicId = nucleicId;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nucleicId=" + nucleicId +
                '}';
    }
}
