package javasnippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class S3_PredefinedFunctionInterfaces {
    public static void main(String[] args) {



        Consumer consumer = i -> System.out.println("I'm a Consumer, I'm printing a parameter: "+i);
        consumer.accept(10);

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println("I'm From Predicate checking if number is Even : "+predicate.test(10));

        Supplier<String> supplier = () ->{ return "Hello from Supplier Examples";};
        System.out.println(supplier.get());

        //Using Stream api
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);

        list.stream().filter(i-> i%2==0) //filter uses predicate.
                     .forEach(i -> System.out.println("even: "+ i));// for each uses consumer functional interface

        List<String> l1 = Arrays.asList("I'm not empty");
        System.out.println(l1.stream().findAny().orElseGet(()->"Not Happy?"));
    }
}
