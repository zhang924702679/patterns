package com.yao.visitor.impl;

import com.yao.visitor.Visitor;

public class Parent implements Visitor {
    @Override
    public void visit(Student student) {
        //定义查看的数据格式
        System.out.println(student.toString());
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println(teacher.toString());
    }
}
