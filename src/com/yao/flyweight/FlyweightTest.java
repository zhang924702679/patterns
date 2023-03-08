package com.yao.flyweight;

public class FlyweightTest {

    private static NucleicInfoClient client = new NucleicInfoClient();
    public static void main(String[] args) {
        PersonInfo bob = new PersonInfo("bob", "北京市海淀区xx大街xx小区x号楼x号", 2);
        PersonInfo muse = new PersonInfo("muse", "北京市朝阳区yy大街yy小区y号楼y号", 7);
        PersonInfo john = new PersonInfo("john", "上海市市徐汇区zz大街zz小区z号楼z号", 4);

        printPersonInfo(bob);
        printPersonInfo(muse);
        printPersonInfo(john);
    }

    public static void printPersonInfo(PersonInfo personInfo) {
        NucleicInfo nucleicInfo = client.getNucleicInfo(personInfo.getNucleicId());
        System.out.println(String.format("姓名=%s 居住地址=%s 核酸网点=%s", personInfo.getName(), personInfo.getAddress(),
                nucleicInfo.getName()));
    }
}
