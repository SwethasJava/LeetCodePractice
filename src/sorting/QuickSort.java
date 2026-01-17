package sorting;

public class QuickSort {
    public static void main(String args[])
    {
        int arr[]= {8,2,4,7,1,3,9,6,5};
        int temp=0;
        int i=-1;
        int j=0;

        System.out.print("Before sorting: ");
        for (int d = 0; d < arr.length; d++) {
            System.out.print(arr[d]);
            if (d < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int pivotNum=arr.length-1;
        int pivot=arr[pivotNum];
        System.out.println("Before Enter while loop"+ j +"pivot "+pivot );
        while(j<=pivotNum)

        {
          System.out.println(" pivotNum "+pivotNum);
            System.out.println(" pivotNum "+i);

            if(arr[j]>pivot)
            {
            //    System.out.println("Do Nothing");
             //  j=j+1;
            }
            else if(arr[j]<pivot)
            {
                i=i+1;
              //  System.out.println("Swaaping the values "+ arr[i]+ arr[j]);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j=j+1;

               // System.out.println("After Swaaping the values "+ arr[i]+ arr[j]);
            }
            j=j+1;
        }

        for (int d = 0; d < arr.length; d++) {
            System.out.print("  "+ arr[d]);
            if (d < arr.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
