package com.yao.state;

public class Result {

    private String code;

    private String description;

    public Result() {
    }

    public Result(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
