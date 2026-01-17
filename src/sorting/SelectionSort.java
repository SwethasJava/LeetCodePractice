package sorting;

public class SelectionSort {


    public static void main(String[] args) {

        int arr[] = {65,25,12,22,11};


         int pointer =1;
         for(int i=1;i<arr.length-1;i++) {
             int min=getMinInUnsortedArray(arr);
             if (arr[pointer]<min)
             {
                 int temp = arr[pointer];
                 arr[pointer] = arr[i];
                 arr[i] = temp;

             }
             pointer++;
             System.out.println("Pointer "+arr[pointer] );
         }
         //System.out.println("minimum Value "+min);


           /* // Swap the min value
            */

                for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
        }
    }




}

    private static int getMinInUnsortedArray(int[] arr) {
        int min=0;
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum number in an unsorted array
            int pointer = i;
            min = arr[i + 1];
            for (int j = 1; j < arr.length - 2; j++) {
                if (arr[i] <= min) {

                    min = arr[j];
                }

            }
        }
        return min;
    }
    }

