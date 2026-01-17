package Practice;

public class RotateElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;

        rotateArray(arr, k);

        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;

        // Adjust k if it's greater than n
        k = k % n;

        // Base case: if k is 0 or n is 1, no rotation needed
        if (k == 0 || n == 1) {
            return;
        }

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse the remaining n - k elements
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}
