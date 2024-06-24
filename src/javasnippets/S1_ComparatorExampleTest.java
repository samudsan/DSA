package javasnippets;

import java.util.*;

public class S1_ComparatorExampleTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        // For sort method of collection we need provide list and a comparator class
        Collections.sort(list, new ComparatorExample());
        System.out.println(list);
    }
}

class ComparatorExample implements Comparator<Integer>{

    @Override
    public int compare(Integer i1 , Integer i2) {
        return i1.compareTo(i2); // To sort in reverse order just flipped i2 and i1 postions
    }
}
