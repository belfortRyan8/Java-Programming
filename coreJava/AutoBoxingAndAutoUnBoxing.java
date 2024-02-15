package coreJava;
/*
    AutoBoxing ::   Automatic Conversion of primitive data to Wrapper Object by the compiler is known as AutoBoxing .
                    Internally compiler will call the : valueOf( )
    AutoUnBoxing :  Automatic Conversion of Wrapper object to Primitive data by the compiler is known as AutoUnBoxing.
                    Internally compiler will call the : xxxxValue( ) , Eg: intValue(), floatValue() etc.
 */
public class AutoBoxingAndAutoUnBoxing {
    public static void main(String[] args) {
        System.out.println("-----AutoBoxing-----");

        int i1 = 10;
        //Integer i2 = Integer.valueOf(i1); :: AutoBoxing
        Integer i2 = i1;    // Primitive --->Wrapper
        System.out.println(i1);
        System.out.println(i2);

        System.out.println("-----AutoUnBoxing-----");
        Integer i3 = 10;
        //int i4 = i3.intValue(); :: AutoUnBoxing
        int i4 = i3;    // Wrapper ---> Primitive
        System.out.println(i1);
        System.out.println(i2);
    }
}
