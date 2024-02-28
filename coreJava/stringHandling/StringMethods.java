package coreJava.stringHandling;
import java.lang.String;
/**
 * Useful String methods
 * eg : r   i   p   a   n
 *      0   1   2   3   4
 * */
public class StringMethods {
    public static void main(String[] args) {
        String s = "ripan"; //

        System.out.println("Length is : "+s.length()); // here 5
        System.out.println(s.charAt(2)); // p
        System.out.println(s.concat(" baidya")); // ripan baidya

        System.out.println("upper Case : "+s.toUpperCase());
        System.out.println("lower Case : "+s.toLowerCase());

        System.out.println(s.equals("ripan")); // true
        System.out.println(s.equals("RIPAN")); // false
        System.out.println(s.equalsIgnoreCase("RIPAN")); // true

        System.out.println("substring only Starting index: "+s.substring(1)); // ipan
        System.out.println("substring starting and ending index: "+s.substring(1,4)); // 1 --> end -1 (3)   :: ipa

        System.out.println("replace: "+s.replace('a','o')); // replace(old,new) :: ripon

        System.out.println("toString :" +s.toString());

        System.out.println("indexOf : "+s.indexOf('n')); // 4
        System.out.println("lastIndexOf :"+s.lastIndexOf('i')); // 1

        String s2 = " ryan    ";
        System.out.println("trim : "+s2.trim()); // remove leading and trailing whitespace  :: ryan

        compareTo :
        {
            String str1 = "apple";
            String str2 = "banana";
            String str3 = "apple";

            int result1 = str1.compareTo(str2);
            int result2 = str1.compareTo(str3);

            System.out.println("Result1: " + result1); // -1
            System.out.println("Result2: " + result2); // 0
        }

        System.out.println("contains : "+s.contains("ripon")); // false , wrong is 'o'

        System.out.println("starts with :"+s.startsWith("ri")); // true
        System.out.println("ends with : "+s.endsWith("on")); // false
        System.out.println("ends with :"+s.endsWith("an")); // true

        isEmptyAndisBlanck:{
            String s3 = "";
            System.out.println(s3.isEmpty()); // true
            System.out.println(s3.isBlank()); // true

            String s4 = " ";
            System.out.println(s3.isEmpty()); // false
            System.out.println(s3.isBlank()); // true
        }
    }
}
