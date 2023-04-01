package function;

import com.sun.org.apache.xpath.internal.functions.FuncCount;
import function.reference.TypeHandel;
import function.sam.Sam;
import function.sam.Sam2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {
        method5(a -> {
            System.out.println("1111111");
            return "function既需要参数也需要返回值,返回值和参数可以不一样";
        }).run();
    }

    //测试自定义函数式接口
    public static void method() {
        Sam sam = (a) -> {
            return a + a;
        };
        System.out.println(sam.test("啊"));
    }

    //java内置函数对象 每一个函数所调用的方法都是不一样的
    public static void method2() {
        Function<Integer,String> function = (a) -> {
            return "function既需要参数也需要返回值,返回值和参数可以不一样";
        };
        System.out.println(function.apply(1));

        Supplier<String> stringSupplier = () -> {
            return "stringSupplier不需要参数,只需要返回值";
        };
        System.out.println(stringSupplier.get());

        Consumer<String> consumer = (a) ->{
            System.out.println("consumer需要参数,但没有的返回值");
        };
        consumer.accept("1");

        Runnable r = () -> System.out.println("Runnable不需要返回值和参数");
        r.run();

        Predicate<String> predicate = (a) -> {
            System.out.println("predicate需要参数,但是返回值固定为boolean类型");
            return a != null && !"".equals(a);
        };
        System.out.println(predicate.test("111"));

        //这里做了一个特殊操作
        UnaryOperator<String> unaryOperator = (a) -> {
            System.out.println("需要参数和返回值,但是参数和返回值必须保持一直");
            return "";
        };
        unaryOperator.apply("");
    }

    public static void method3() {
        Function<Integer, Consumer<String>> function = (a) -> {
            System.out.println("我是function");
            return (b) ->{
                System.out.println("我是consumer");
            };
        };
        //返回值也可以是函数式接口这样就可以形成连续调用
        function.apply(1).accept("2");
    }

    //函数表达式的特殊写法 这种写法回去自动匹配限制
    //以function为例 它本身就需要有返回值和参数的函数表达式
    public static void method4() {
        //
        Long ab = 123456L;
        String s = String.valueOf(ab);
        System.out.println(
                s
        );

        String test1 = "我是xxx";
        Function<String,String> function = TypeHandel::convertString;
        function.apply(test1);

        Supplier<Map> stringSupplier = HashMap<String,String>::new;
        String test2 = "我是yyy";
        //第四种类型 方法需要的形参多余实际参数一个 就可以看做形参的第一个调用调用方法,而方法的参数就是形参的第二个
        //即便是这样也要遵守方法的返回值和接收函数返回值类型一样
        Sam2 sam2 = String::concat;
        System.out.println(sam2.test(test1, test2));

        //Sam2 sam2 = String::concat;
        //sam2.test("1","1");
    }

    public static Runnable method5(Function<String,String> function) {
         Runnable runnable = () -> {
             function.apply("");
        };
         return runnable;
    }
}
