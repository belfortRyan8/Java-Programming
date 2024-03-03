import java.util.Comparator;
import java.util.TreeSet;

/*
    Write a Java program to insert  StringBuffer objects into a TreeSet while sorting order is in increasing length order.
    If two objects have the same length, then consider their alphabetical order.
*/
class IncreasingLengthOrderSorting implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        // 1. type caste
        String str1 = obj1.toString();
        String str2 = obj2.toString();
        // 2. finding the length
        int lengthOfTheFirstString = str1.length();
        int lengthOfTheSecondString = str2.length();

        if(lengthOfTheFirstString < lengthOfTheSecondString){
            return  -1;
        }else if(lengthOfTheFirstString > lengthOfTheSecondString){
            return 1;
        }else {
            return str1.compareTo(str2);
        }
    }
}
public class SortingInIncreasingLengthOrder {
    public static void main(String[] args) {
        TreeSet<Object> nameOfTheObject = new TreeSet<>(new IncreasingLengthOrderSorting());
        nameOfTheObject.add(new StringBuffer("java"));
        nameOfTheObject.add(new StringBuffer("servlet"));
        nameOfTheObject.add(new StringBuffer("goLang"));
        nameOfTheObject.add(new StringBuffer("Microservice"));
        nameOfTheObject.add(new StringBuffer("cpp"));
        nameOfTheObject.add(new StringBuffer("java"));
        nameOfTheObject.add(new StringBuffer("c"));

        System.out.println("Elements are : "+nameOfTheObject);
    }
}
