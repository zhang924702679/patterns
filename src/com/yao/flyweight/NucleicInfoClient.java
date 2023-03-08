package com.yao.flyweight;

import java.util.HashMap;

public class NucleicInfoClient {

    private HashMap<Integer, NucleicInfo> pool = new HashMap<>();

    public NucleicInfoClient() {
        NucleicInfo nucleicInfo;
        for (int i = 1; i <=10; i++) {
            nucleicInfo = new NucleicInfo(i, "北京市第"+i+"医院核酸网点");
            pool.put(nucleicInfo.getId(), nucleicInfo);
        }
    }

    public NucleicInfo getNucleicInfo(Integer key) {
        if (key == null || !pool.containsKey(key)) {
            return null;
        }
        return pool.get(key);
    }
}
