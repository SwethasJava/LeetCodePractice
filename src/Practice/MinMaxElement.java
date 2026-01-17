package Practice;

import java.util.ArrayList;
import java.util.List;

public class MinMaxElement {
    public static void main(String args[]) {
        int arr[] = {65, 25, 2, 22, 11, 0, 8};
        int min = findMinMax(0, arr.length - 1, arr);
        System.out.println("Min element: " + min);
    }

    private static int findMinMax(int low, int high, int[] arr) {
        // Base case: if the subarray has only one element
        if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        // Recursively find the minimum in the left subarray
        int leftMin = findMinMax(low, mid, arr);

        // Recursively find the minimum in the right subarray
        int rightMin = findMinMax(mid + 1, high, arr);

        // Return the minimum of the two
        return Math.min(leftMin, rightMin);
    }
}
