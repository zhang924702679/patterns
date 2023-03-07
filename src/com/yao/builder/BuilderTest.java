package com.yao.builder;

public class BuilderTest {
    public static void main(String[] args) {
        AudiCarBuilder audiCarBuilder1 = new AudiCarBuilder();
        AudiCarBuilder audiCarBuilder2 = new AudiCarBuilder();
        System.out.println(audiCarBuilder1.getCar());
        audiCarBuilder1.initailWheel("audiA8").initalDoor("audiA8").initalEngine("audiA8").initalGear("audiA8");
        System.out.println(audiCarBuilder1.getCar());
    }
}
