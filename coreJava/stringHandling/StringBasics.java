package coreJava.stringHandling;
/**
 * String in java refers to the collection of characters .
 * it is immutable in nature . meaning once the object is created we can't change the value of the object, if we try to make change then those
 * change will be reflected on new object not on the existing object .
 */

import java.lang.String;

public class StringBasics {
    public static void main(String[] args) {
        string :
        {
            String str1 = new String("ryan");
            String str2 = "ryan";

            System.out.println("str1 : " + str1);
            System.out.println("str2 : " + str2);

            System.out.println(str1 == str2); // check the refference ,if same then true or else false. here false .
            System.out.println(str1.equals(str2)); // check the content or data present inside the string object . ture if same or else false . here true
        }
        string_buffer :{
            StringBuffer sb1 = new StringBuffer("ryan");
            // StringBuffer sb2 = "ryan"; not possible
            StringBuffer sb2 = new StringBuffer("ryan");

            System.out.println("sb1 : "+sb1);
            System.out.println("sb2 : "+sb2);

            System.out.println(sb1 == sb2); // check the refference ,if same then true or else false. here false .
            System.out.println(sb1.equals(sb2)); // since, String builde class .equals( ) is not overridden so that it doesnt matter whether the content
            // is same of not , it will check the refference , it same then true or else false .
        }
        String s1 = "java";
        s1.toUpperCase(); // new object will be created but any changing will not happen on the existing type
        System.out.println(s1); // java

    }
}
