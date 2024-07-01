package project1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //

        // Inserting an element at the 1st index
        arrayList.add(1, 10); // Adds 10 at index 1

        // Extracting the element at the 0th index
        int elementAtIndex0 = arrayList.get(1);

        // Printing the ArrayList and the extracted element
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 0: " + elementAtIndex0);
    }
}
