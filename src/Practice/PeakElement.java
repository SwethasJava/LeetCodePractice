package Practice;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

    public static void main(String args[]) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        List<Integer> peaks = peakElement(0, arr.length - 1, arr);
        System.out.println("Peak elements: " + peaks);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static List<Integer> peakElement(int low, int high, int[] arr) {
        List<Integer> peaks = new ArrayList<>();

        // Base case: if low > high, return empty list
        if (low > high) {
            return peaks;
        }

        int mid = (low + high) / 2;

        // Check if mid is a peak element
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
            peaks.add(arr[mid]);
        }

        // Recursively find peaks in the left subarray
        peaks.addAll(peakElement(low, mid - 1, arr));

        // Recursively find peaks in the right subarray
        peaks.addAll(peakElement(mid + 1, high, arr));

        return peaks;
    }
}
