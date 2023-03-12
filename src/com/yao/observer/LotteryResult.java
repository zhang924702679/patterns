package com.yao.observer;

import java.util.Date;

public class LotteryResult {

    private String uid;

    private String init;

    private Date date;

    public LotteryResult() {
    }

    public LotteryResult(String uid, String init, Date date) {
        this.uid = uid;
        this.init = init;
        this.date = date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LotteryResult{" +
                "uid='" + uid + '\'' +
                ", init='" + init + '\'' +
                ", date=" + date +
                '}';
    }
}
