package com.yao.composite;

public class CompositeTest {
    public static void main(String[] args) {
        // 创建公司所有职员
        BranchCorp a = new BranchCorp("A", "董事长", 100000);
        BranchCorp b = new BranchCorp("B", "技术总监", 70000);
        BranchCorp c = new BranchCorp("C", "人事总监", 60000);
        BranchCorp d = new BranchCorp("D", "财务总监", 50000);
        LeafCorp b1 = new LeafCorp("B1", "程序员", 30000);
        LeafCorp b2 = new LeafCorp("B2", "程序员", 20000);
        LeafCorp c1 = new LeafCorp("C1", "HR", 15000);
        LeafCorp d1 = new LeafCorp("D1", "会计", 13000);

        // 根据下属关系，构建树形结构
        a.addSubCorp(b, c, d);
        b.addSubCorp(b1, b2);
        c.addSubCorp(c1);
        d.addSubCorp(d1);

        // 获得下属信息
        System.out.println("-----a的下属-----");
        getSubCorp(a);
        System.out.println("-----b的下属-----");
        getSubCorp(b);
    }

    // 获得branchCorp的下属
    private static void getSubCorp(BranchCorp branchCorp) {
        for (AbstractCorp corp : branchCorp.getSubCorp()) {
            System.out.println("corp = " + corp.getCorpInfo());
            if (corp instanceof BranchCorp) {
                getSubCorp((BranchCorp) corp);
            }
        }
    }
}
