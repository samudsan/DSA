package java8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class F2_StreamsSortExample_Primitive {
    public static void main(String[] args) {
        /*two different ways of sorting*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(5);

        Collections.sort(list); //Method 1
        System.out.println(list);
        list.stream().sorted().forEach(i-> System.out.println(i)); // Method 2
    }
}
