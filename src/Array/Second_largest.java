package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Second_largest {

    public static Optional<Integer> largest(int[] arr) {
        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 9, 5, 8};
        Optional<Integer> secondLargest = Second_largest.largest(arr);

        if (secondLargest.isPresent()) {
            System.out.println("The second largest element is: " + secondLargest.get());
        } else {
            System.out.println("Array is empty or has only one element.");
        }

    }
}