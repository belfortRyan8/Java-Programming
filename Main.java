import  java.lang.*;
import java.util.*;

public class Main {
    public static void main(String... args){
        System.out.println(m1());
    }
    public static int m1(){
        try{
            System.out.println(10/0);
            return 777;
        }catch(ArithmeticException e){
            return 888;
        }
    }
}
