package javasnippets;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class S7_TreeMapSortingByValueExample {
    public static void main(String[] args) {
        //By Default treeMap sort its entries based on Keys
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a",5);
        treeMap.put("c",23);
        treeMap.put("d",3);
        treeMap.put("b",808);
        System.out.println("Sorted treeMap based on Keys: "+treeMap); // Keys will be sorted

        // Sorting Using Values, we are storing elements into List, sorting list using collection.sort()
        // then adding sorted elements into a LinkedHashMap and then to TreeMap
        // we are using linked hashmap as it preserve order of insertion.
        ArrayList<Map.Entry<String, Integer>> entryArrayList = new ArrayList<>(treeMap.entrySet());
        entryArrayList.sort(Map.Entry.comparingByValue());
        System.out.println(entryArrayList);
        System.out.println("Sorted Arraylist tree map entries : " + entryArrayList);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: entryArrayList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("TreeMap sorted by value"+linkedHashMap);


    }
}
