package collectionAPI.set;
import java.util.*;
// Insert String object into treeSet , perform sorting in reverse of alphabetical order . -> z-a/Z-A
// Comparator (I) : Customized Soring
// Comparable(I)  : Default natural Sorting
class CustomizedSorting implements Comparator{
    @Override
    public int compare(Object ob1, Object obj2){
        String string1 = (String) ob1;
        String string2 = (String) obj2;
        return string2.compareTo(string1); // descending order ..
    }
}
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> name= new TreeSet<String>();
        name.add("ryan");
        name.add("lisa");
        name.add("ankita");
        name.add("torsha");
        name.add("dipa");
        System.out.println("Default natural Sorting :"+name);

        TreeSet<String> name2= new TreeSet<String>(new CustomizedSorting());
        name2.add("ryan");
        name2.add("lisa");
        name2.add("ankita");
        name2.add("torsha");
        name2.add("dipa");

        System.out.println("Customized Sorting :"+name2);
    }
}
