package com.yao.prototype;

import java.util.ArrayList;
import java.util.Map;

import com.yao.prototype.question.AnswerQuestion;
import com.yao.prototype.question.ChoiceQuestion;

public class QuestionBank implements Cloneable{

    //如果使用原型模式需要实现Cloneable接口 重写clone方法
    //姓名
    private String name;
    //学号
    private String number;

    //选择题
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    //解答题
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<ChoiceQuestion> getChoiceQuestionList() {
        return choiceQuestionList;
    }

    public void setChoiceQuestionList(ArrayList<ChoiceQuestion> choiceQuestionList) {
        this.choiceQuestionList = choiceQuestionList;
    }

    public ArrayList<AnswerQuestion> getAnswerQuestionList() {
        return answerQuestionList;
    }

    public void setAnswerQuestionList(ArrayList<AnswerQuestion> answerQuestionList) {
        this.answerQuestionList = answerQuestionList;
    }

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考生：" + name + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }

    @Override
    public QuestionBank clone() {
        try {
            QuestionBank clone = (QuestionBank) super.clone();
            clone.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
            clone.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
