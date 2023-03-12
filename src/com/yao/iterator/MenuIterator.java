package com.yao.iterator;

public interface MenuIterator {

    // 容器中是否还有元素
    boolean hasNext();

    // 获得容器中的下一个元素
    MenuItem next();
}
