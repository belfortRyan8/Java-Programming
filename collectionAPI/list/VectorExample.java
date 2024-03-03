package collectionAPI.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Displaying the elements of the Vector
        System.out.println("Vector elements: " + vector);

        // Adding an element at a specific index
        vector.add(1, 15);
        System.out.println("After adding 15 at index 1: " + vector);

        // Getting the element at a specific index
        int elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Removing an element at a specific index
        vector.remove(0);
        System.out.println("After removing element at index 0: " + vector);

        // Checking if an element exists
        boolean containsElement30 = vector.contains(30);
        System.out.println("Does the vector contain 30? " + containsElement30);

        // Getting the size of the Vector
        int sizeOfVector = vector.size();
        System.out.println("Size of Vector: " + sizeOfVector);

        // Clearing the Vector
        vector.clear();
        System.out.println("After clearing the Vector: " + vector);

        // Checking if the Vector is empty
        boolean isEmptyVector = vector.isEmpty();
        System.out.println("Is Vector empty? " + isEmptyVector);
    }
}
