package List;
import java.util.*;
public class VectorDemo {
	public static void print(Vector ll) {
		for(int i =0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	}
	public static void main(String[] args) {
		 Vector<String> colors = new Vector<>();

	        // Add elements to the Vector
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Display the Vector
	        System.out.println("Vector: " + colors);
	        
	        // Get a sub-vector from the original Vector
	        Vector<String> subVector = new Vector<>(colors.subList(1, 3));
	        System.out.println("Sub-vector: " + subVector);
	        
	        // Get the size of the Vector
	        int size = colors.size();
	        System.out.println("Size of the Vector: " + size);

	        // Check if the Vector is empty
	        boolean isEmpty = colors.isEmpty();
	        System.out.println("Is the Vector empty? " + isEmpty);

	        // Access elements of the Vector
	        String firstElement = colors.firstElement();
	        String lastElement = colors.lastElement();
	        System.out.println("First element: " + firstElement);
	        System.out.println("Last element: " + lastElement);

	        // Get an element at a specific index
	        String elementAtIndex = colors.get(2);
	        System.out.println("Element at index 2: " + elementAtIndex);

	        // Update an element at a specific index
	        colors.set(1, "Purple");
	        System.out.println("Vector after updating element at index 1: " + colors);

	        // Remove an element at a specific index
	        colors.remove(3);
	        System.out.println("Vector after removing element at index 3: " + colors);

	        // Remove the first occurrence of an element
	        boolean removed = colors.remove("Red");
	        System.out.println("Vector after removing 'Red': " + colors);
	        System.out.println("Was 'Red' removed? " + removed);

	        // Check if the Vector contains a specific element
	        boolean containsBlue = colors.contains("Blue");
	        System.out.println("Does the Vector contain 'Blue'? " + containsBlue);

	        // Get the index of an element in the Vector
	        int index = colors.indexOf("Green");
	        System.out.println("Index of 'Green': " + index);
	 

	        // Clear all elements from the Vector
	        colors.clear();
	        System.out.println("Vector after clearing all elements: " + colors);

	}

}
