package com.yao.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class BranchCorp extends AbstractCorp{

    private ArrayList<AbstractCorp> corps = new ArrayList<>();

    public BranchCorp(String name, String position, int salary) {
        super(name, position, salary);
    }

    // 添加职员
    public void addSubCorp(AbstractCorp... corp) {
        corps.addAll(Arrays.asList(corp));
    }

    // 返回手下的职员
    public ArrayList<AbstractCorp> getSubCorp() {
        return corps;
    }
}
