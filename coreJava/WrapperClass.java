package coreJava;
import java.lang.*;
/*
*   Why we Need Wrapper Class : To wrap primitives into Object form, so that we can handle primitives also just like Objects.
	To define several utility methods( static methods )which are Required for primitives.
	Eg. Primitive types and it's Corresponding Wrapper classes : int --> Integer, char --> character , float --> Float

*   In case of Peforming all these method we might face RuntimeException named NumberFormatException
    1. valueOf() method.	:: 	Primitive / String ------------------------> Wrapper 	|	String str = 10 ;	Integer num = Integer.valueOf(str) ; // 10
    2. xyzValue() method.	::	Wrapper -----------------------------------> Primitive 	|	Integer in = 10 ; 	int num = in.intValue();
    3. parseXyx() method.	::	String ------------------------------------> Primitive  |	int num 	= Integer.parseInt("20") ;
    4. toString() method.	::	Primitive / Wrapper Object ----------------> String 	|	Integer in = 10 ; 	String str = in.toString( );

 */
public class WrapperClass {
    public static void main(String[] args) {
        // parseXyz :: string --> primitive
        String s1 = "10";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1); // 10
        String s2 = "35.5";
        double d1 = Double.parseDouble(s2);
        System.out.println(d1); // 35.5

        // toString :: primitive / wrapper object --> String

        int i2 = 20;
        String s3 = Integer.toString(i2);
        System.out.println(s3); // 20
        Double d2 = 25.5;
        String s4 = Double.toString(d2);
        System.out.println(s4); // 25.5

        // valueOf() : String/ primitive  --> Wrapper
        String s5 = "30";
        Integer in = Integer.valueOf(s5);
        System.out.println(in); // in
        float f = 3.2f;
        Float fl = Float.valueOf(f);
        System.out.println(fl); // fl

        // xyxValue :: Wrapper --> primitive
        Integer in2 = 8;
        int num = in2.intValue();
        System.out.println(num); // 8
        Double db = 13.10;
        double d3 = db.doubleValue();
        System.out.println(d3); // 13.10

    }
}
