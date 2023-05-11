package java8_features;

import java.util.function.IntBinaryOperator;

/*
* lamda expression are kind of anonymous methods,
* if you have multiple lines, we need to surround body with braces.
* Lamda expression should be a functional interface,
* meaning we should have a Interface containing only one methods with exact return type and parameter that of lamda expression that we use
*
* Thi is how a lambda function will be executed, compiler just calls interface method, just as if it were an instance of a class.
* */
public class F1_LambdaExpression {
    public static void main(String[] args) {
        MyLamda1 l1  = (int a, int b) -> System.out.println(a + b); // it works fine even if you ignore a, b declaration
        MyLamda2 l2  = () -> System.out.println("Hello from Lambda");
        l1.myfunction(1,2);
        l2.myfunction();
    }
}

interface MyLamda1{
    void myfunction(int x, int y);
}

interface MyLamda2{
    void myfunction();
}