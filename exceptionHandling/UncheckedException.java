package exceptionHandling;
import java.lang.*;

/*
    ~> Unchecked Exception : The exceptions which are not checked by the compiler whether programmer is handling or not such type of
    exceptions are called as "UnCheckedExceptions". eg::NullPointerException,ArithmeticException
    Note:: RunTimeException and its child classes,Error and its child classes are called as "UncheckedException",
    remaining all exceptions are considered as "CheckedExceptions".
 */

public class UncheckedException {
    private static void arithmeticException(){
        int a = 10, b = 0 ;
        // System.out.println(a/b); exception will occur
        try{
            System.out.println("inside try block");
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("exception is handled..");
        }
    }
    private static void arrayIndexOutOfBoundException(){
        int []arr ={1, 2, 3, 4, 5};
        try{
            System.out.println(arr[10]); // here, in our example index 10 doesn't exist ..
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("exception caught ..");
        }
    }
    private static void stringIndexOutOfBoundException(){
        String str = "checkMyLinkedin";
        try{
            System.out.println(str.charAt(-2)); // accessing negative index is not possible
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Exception caught");
        }
    }
    private static void nullPointerException(){
        String str = null ;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("exception caught ");
        }
    }
    public static void main(String[] args) {
        // you can refer the function ...
        arithmeticException();
        arrayIndexOutOfBoundException();
        stringIndexOutOfBoundException();
        nullPointerException();
    }
}
