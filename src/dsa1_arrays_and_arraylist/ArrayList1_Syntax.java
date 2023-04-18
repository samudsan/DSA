package dsa1_arrays_and_arraylist;

import java.util.ArrayList;

public class ArrayList1_Syntax {
    public static void main(String[] args) {

        // mentioning size for an arraylist is optional
        // however you can define initial size
        ArrayList<Integer> al = new ArrayList<>();

        // inserting
        al.add(10);
        al.add(20);
        System.out.println(al);

        //getting an element
        System.out.println(al.get(1));

        // updating
        al.set(0,30);
        System.out.println(al);

        //deleting
        al.remove(1);
        System.out.println(al);

        // check contains
        System.out.println(al.contains(30));
    }
}
