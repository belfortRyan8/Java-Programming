package coreJava;
import java.lang.*;
/*
*   The process of converting data from one type to another type is called TypeCasting. There are 2 types
        1. Implicit type casting : The process of converting data from lower data type to higher datatype is called "Implicit type casting".
        2. Explicit type casting : The process of converting data from higher data type to lower data type is called "Explicit Type casting".
        * jvm is responsible for Explicit type casting. in this, there is a Possibility of data loss .
*   Refer this :
        byte => short => int => long => float => double
                          ^
                         char
 */
public class TypeCasting {
    public static void main(String[] args) {
        /* implicit type casting */
        byte b  = 10;
        short s = b ;
        int i   = b;
        System.out.println(b);  // 10
        System.out.println(s);  // 10
        System.out.println(i);  // 10

        char ch = 'A';
        int i2 = ch; // char --> int possible
        System.out.println(ch); // A
        System.out.println(i2); // 65 , Corresponding int value for the particular character .

        /*  Explicit type casting */
        int i3      = 20 ;
        byte b2     = (byte) i3;
        short s2    = (short) i3;
        System.out.println(i3); // 20
        System.out.println(b2); // 20
        System.out.println(s2); // 20

        double d= 22.222;
        byte b3= (byte)(long)(int)(short)d;
        System.out.println(d);//22.222
        System.out.println(b);//22
    }
}
