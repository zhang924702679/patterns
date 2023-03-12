package com.yao.visitor.impl;

import com.yao.visitor.Visitor;

public class Principal implements Visitor {
    @Override
    public void visit(Student student) {
        System.out.println(student.toString());
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println(teacher.toString());
    }
}
