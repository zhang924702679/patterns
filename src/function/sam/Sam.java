package function.sam;

//自定义函数式接口 java自带的函数式接口最多是三个参数 这里我们可以定义N个参数的
//@FunctionalInterface非必须 java会自动检验
//条件是接口 接口中只有一个abstract修饰的方法
@FunctionalInterface
public interface Sam {

    public abstract String test(String var1);
}
