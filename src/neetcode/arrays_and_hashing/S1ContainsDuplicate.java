package neetcode.arrays_and_hashing;

import java.util.HashSet;

public class S1ContainsDuplicate {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,1};
        boolean results = containsDuplicate(array);
        System.out.println(results);
    }

    private static boolean containsDuplicate(int array[]) {
        HashSet<Integer> hs =  new HashSet<>();
        for (int element :array) {
            if(!hs.add(element))
                return true;
        }
        return false;

    }
}
