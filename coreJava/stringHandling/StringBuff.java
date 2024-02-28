package coreJava.stringHandling;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
// StringBuffer and StringBuilder class method are same .
class StringBufferMethods{
    public void trimToSize_ensureCapacity_setLength(){
        StringBuffer sb = new StringBuffer("ryanBelfort");
        sb.setLength(4);
        System.out.println(sb); // ryan

        StringBuffer sb1 =new StringBuffer(100000);
        System.out.println(sb1.capacity()); // 100000
        sb1.append("ryanBelfort");
        System.out.println(sb1.capacity()); // 100000
        sb1.trimToSize();
        System.out.println(sb1.capacity()); // 4

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(10000);
        System.out.println(sb2.capacity());
    }

    public void methodChaining(){
        StringBuffer sb = new StringBuffer();
        sb.append("sachin").insert(6, "tendulkar").reverse().append("IND").delete(0, 4).reverse();
        System.out.println(sb);
    }
}
public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16  is the initial capacity .

        sb.append("Welcome Everyone ..");
        System.out.println(sb); // Welcome Everyone

        System.out.println("length of the string is : "+sb.length()); // 19

        sb.delete(0,sb.length()); // it will delete the entire string
        System.out.println("After first deletetion : "+sb); // since , sb is deleted so that nothing will be printed on the console

        sb.append("Spring Boot");
        System.out.println(sb.substring(0,7));  // Spring

        System.out.println(sb); // Spring Boot

        System.out.println("After apply reverse : "+sb.reverse()); // tooB gnirpS
    }
}
