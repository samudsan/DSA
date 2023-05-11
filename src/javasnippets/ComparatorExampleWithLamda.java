package javasnippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleWithLamda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        Collections.sort(list, (i1, i2) -> i1.compareTo(i2));
        System.out.println(list);
    }
}