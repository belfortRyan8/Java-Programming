package collectionAPI.set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");

        // Displaying the elements of the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Adding duplicate element
        linkedHashSet.add("apple");
        System.out.println("After adding duplicate element: " + linkedHashSet);

        // Removing an element
        linkedHashSet.remove("banana");
        System.out.println("After removing 'banana': " + linkedHashSet);

        // Checking if an element exists
        System.out.println("Does 'apple' exist? " + linkedHashSet.contains("apple"));

        // Getting the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("After clearing the LinkedHashSet: " + linkedHashSet);

        // Checking if the LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // Adding elements again
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");

        // Iterating over the elements using an Iterator
        Iterator<String> iterator = linkedHashSet.iterator();
        System.out.println("Iterating over the LinkedHashSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
