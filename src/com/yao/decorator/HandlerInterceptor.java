package com.yao.decorator;

//根接口 用于规范后续的实现类
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
