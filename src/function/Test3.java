package function;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(-1);
        integers2.add(-2);
        integers2.add(-3);
        integers2.add(5);
        Integer b = integers2.stream().reduce(Integer::sum).get();
        System.out.println(b);
    }
}
