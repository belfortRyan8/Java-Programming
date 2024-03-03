package collectionAPI.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Displaying the elements of the LinkedList using cursor
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            Integer data = (Integer) listIterator.next();
            System.out.print(data+" ");
        }
        System.out.println();

        // Adding an element at the beginning
        linkedList.addFirst(5);
        System.out.println("After adding 5 at the beginning: " + linkedList);

        // Adding an element at the end
        linkedList.addLast(40);
        System.out.println("After adding 40 at the end: " + linkedList);

        // Getting the first element
        int firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        // Getting the last element
        int lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);

        // Removing the first element
        linkedList.removeFirst();
        System.out.println("After removing the first element: " + linkedList);

        // Removing the last element
        linkedList.removeLast();
        System.out.println("After removing the last element: " + linkedList);

        // Getting the size of the LinkedList
        int sizeOfLinkedList = linkedList.size();
        System.out.println("Size of LinkedList: " + sizeOfLinkedList);

        // Checking if an element exists
        boolean containsElement20 = linkedList.contains(20);
        System.out.println("Does the list contain 20? " + containsElement20);

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);

        // Checking if the LinkedList is empty
        boolean isEmptyLinkedList = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmptyLinkedList);
    }
}
