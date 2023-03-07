package com.yao.prototype.question;

import java.util.Map;

public class ChoiceQuestion {
    private String name;                 // 题目
    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ChoiceQuestion{" +
                "name='" + name + '\'' +
                ", option=" + option +
                ", key='" + key + '\'' +
                '}';
    }
}
