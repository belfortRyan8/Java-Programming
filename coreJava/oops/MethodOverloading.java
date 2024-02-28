package coreJava.oops;
/**
 * Method overloading is also knows as compiler time polymorphism .
 */
public class MethodOverloading {
    public static void sum(int a, int b){
        System.out.println("Method 1 is called ");
        System.out.println("sum is :"+(a+b));
        System.out.println();
    }
    public static void sum(int a, int b, int c){
        System.out.println("Method 2 is called ");
        System.out.println("sum is :"+(a+b+c));
        System.out.println();
    }
    public static void sum(double a, double b){
        System.out.println("Method 3 is called ");
        System.out.println("sum is :"+(a+b));
        System.out.println();
    }
    public static void sum(double a, int b){
        System.out.println("Method 4 is called ");
        System.out.println("sum is :"+(a+b));
        System.out.println();
    }
    public static void main(String[] args) {
        sum(5,5); // (int, int ) method 1 will be called .
        sum(10.5,15); // (double, int ) method 2 will be called .
        sum(5.1,10.5); // (double , double ) method 3 will be called .
    }
}
