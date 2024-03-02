package collectionAPI.list;
import java.util.*;

/**
 *  Stack : it follows LIFO or last in first out principle ..
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("is it empty : "+stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nElementes are : ");
        Enumeration enumeration = stack.elements();
        while(enumeration.hasMoreElements()){
            Object data = enumeration.nextElement();
            System.out.print(data+" ");
        }
        System.out.println("is it empty :"+stack.empty());

        System.out.println("search element from stack "+stack.search(50)); // -1
        System.out.println("search elemebt from stack "+stack.search(10)); // 3 offset value ..

        System.out.println("poped element : "+stack.pop());


    }
}
