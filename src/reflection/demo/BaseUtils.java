package reflection.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseUtils {

    public void create(Object obj1, Object obj2) {
        //获取自身虽有参数
        Class<?> aClass = obj1.getClass();
        Class<?> bClass = obj2.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            //需要外判断是否是桥接方法 桥接方法是编译器自动生成
            if (name.startsWith("get") && !name.equals("getClass") && !method.isBridge()) {
                String methodName = "set" + name.substring(3);
                try {
                    Method methodA = aClass.getMethod(name);
                    Object invoke = methodA.invoke(obj1);
                    Method methodB = bClass.getMethod(methodName, invoke.getClass());
                    methodB.invoke(obj2, methodA.invoke(obj1));
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    continue;
                }
            }
        }
    }
}
