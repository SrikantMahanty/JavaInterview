package ArrayList;

import java.util.ArrayList;

public class p2 {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        System.out.println("Original ArrayList: " + al);

        // Calculate the sum of elements
        for (int num : al) {
            sum += num;
        }
        System.out.println("Sum of the elements in the ArrayList: " + sum);

        // Remove elements one by one
        while (!al.isEmpty()) {
            int removedElement = al.remove(0); // Remove the first element
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated ArrayList: " + al);
        }
    }
}
