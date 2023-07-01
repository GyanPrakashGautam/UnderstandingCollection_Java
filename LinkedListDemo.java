package List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void print(LinkedList ll) {
		for(int i =0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	}
	public static void main(String[] args) {
		 // Create a LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Add elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Display the LinkedList
        System.out.println("LinkedList: " + names);

        // Get the size of the LinkedList
        int size = names.size();
        System.out.println("Size of the LinkedList: " + size);

        // Check if the LinkedList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);

        // Access elements of the LinkedList
        String firstElement = names.getFirst();
        String lastElement = names.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Get an element at a specific index
        String elementAtIndex = names.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // Update an element at a specific index
        names.set(0, "Eve");
        System.out.println("LinkedList after updating element at index 0: " + names);

        // Remove an element at a specific index
        names.remove(2);
        System.out.println("LinkedList after removing element at index 2: " + names);

        // Remove the first occurrence of an element
        boolean removed = names.remove("Bob");
        System.out.println("LinkedList after removing 'Bob': " + names);
        System.out.println("Was 'Bob' removed? " + removed);

        // Check if the LinkedList contains a specific element
        boolean containsCharlie = names.contains("Charlie");
        System.out.println("Does the LinkedList contain 'Charlie'? " + containsCharlie);

        // Get the index of an element in the LinkedList
        int index = names.indexOf("Eve");
        System.out.println("Index of 'Eve': " + index);

        // Clear all elements from the LinkedList
        names.clear();
        System.out.println("LinkedList after clearing all elements: " + names);
	}

}
