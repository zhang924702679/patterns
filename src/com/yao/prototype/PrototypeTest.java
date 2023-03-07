package com.yao.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        QuestionBankController questionBankController = new QuestionBankController();

        QuestionBank xiaomei = questionBankController.createQuestionBank("小妹", "0003");
        System.out.println(xiaomei.toString());


    }
}
