package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.yao.singleton.SingletonDemo1;

import reflection.demo.*;

public class ReflectionTest {

//    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//    }

    public static void method1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<B> bClass = B.class;
        B b  = (B) bClass.getConstructor().newInstance();
        Field name = bClass.getDeclaredField("id");
        Method setName = bClass.getMethod("setName", String.class);
        Object invoke = setName.invoke(b, "测试信息");
        Method getName = bClass.getMethod("getName");
        String getNameString = (String)getName.invoke(b);
        System.out.println(getNameString);
        name.setAccessible(true);
        Object o = name.get(b);
        System.out.println(o);
//        //反射拿不到父类中private修饰的变量或者方法
    }

//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Class<C> cClass = C.class;
//        C<String> c = cClass.getConstructor().newInstance();
//        c.setTest("String");
//        System.out.println(c.getTest());
//        for (Method method : cClass.getMethods()) {
//            System.out.println(method.getName());
//        }
//    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BaseUtils baseUtils = new BaseUtils();
        TestVO testVO = new TestVO();
        System.out.println(testVO.getId() + "赋值之前===========");
        testVO.setCount("11");
        testVO.setType("222");
        testVO.setId("ED11");
        TestDO testDO = new TestDO();
        baseUtils.create(testVO, testDO);
        System.out.println(testDO.getId() + "赋值之后===========");
//        TestDO testDO = new TestDO();
//        Class<? extends TestDO> aClass = testDO.getClass();
//        Method[] methods = aClass.getMethods();
//        Method methods1 = methods[0];
//        Class<?>[] parameterTypes = methods1.getParameterTypes();
//        for (Class<?> parameterType : parameterTypes) {
//            Class<? extends Class> aClass1 = parameterType.getClass();
//
//        }
//        Method setType = aClass.getMethod("setType", String.class);
//        Method getType = aClass.getMethod("getType");
//        setType.invoke(testDO, "type");
//        Object invoke = getType.invoke(testDO);
//        System.out.println(invoke.getClass());
//        System.out.println(testDO.getType());
//
//        Method setType1 = aClass.getMethod("setType", invoke.getClass());
//        System.out.println("有希望");
    }
}
