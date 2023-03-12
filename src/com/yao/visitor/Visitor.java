package com.yao.visitor;

import com.yao.visitor.impl.Student;
import com.yao.visitor.impl.Teacher;

public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);
}
