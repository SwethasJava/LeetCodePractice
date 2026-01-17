package sorting;

public class BubbleSort {
    public static void main (String args[])
    {
        int arr[]= {5,6,3,2};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        for(int i=0;i<arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " +arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
