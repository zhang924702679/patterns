package com.yao.prototype.question;

public class AnswerQuestion {

    private String name;  // 问题
    private String key;   // 答案

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    @Override
    public String toString() {
        return "AnswerQuestion{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
