package javasnippets;

import java.util.*;

/*we can also sort keys in sorted order with below program by just changing Map.Entry.comparingByValue() to Map.Entry.comparingByKey()*/
public class S0_SortHashMapValues {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 3);
        unsortedMap.put("banana", 2);
        unsortedMap.put("orange", 1);
        unsortedMap.put("pear", 4);

        // Create a list of entries from the unsorted map
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

        // Sort the list based on the values of the entries
        Collections.sort(entryList, Map.Entry.comparingByValue());

        // Create a new linked hash map to maintain the order of the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println(sortedMap); // Output: {orange=1, banana=2, apple=3, pear=4}*/

        // Sorting using lamda function.
        Collections.sort(entryList, ((o1, o2) -> o1.getValue()- o2.getValue()));
        System.out.println(entryList);

        System.out.println("sorted keys using lamda");
        entryList.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}