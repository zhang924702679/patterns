package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {
        //map方法的使用
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("feg");
        Stream<String> lists = list.stream(); //获取一个顺序流
        lists.map(item-> {
            return item + item;
        }).forEach(System.out::println);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(-1);
        integers.add(-2);
        integers.add(-3);
        integers.add(5);
        List<Integer> a = integers.stream().filter(item -> {
            if (item > 0) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println(integers.size());
        System.out.println(a.size());

        //求和
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(-1);
        integers2.add(-2);
        integers2.add(-3);
        integers2.add(5);
        int count = integers2.stream().reduce(0, Integer::sum);
        System.out.println(count);

        //拼接字符串
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String abcd = letters.stream().reduce("", String::concat);
        System.out.println(abcd);
    }
}
