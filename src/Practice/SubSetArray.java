package Practice;

public class SubSetArray {
    public static void main (String args[])
    {
        int arr1[] = {65, 25, 2, 22, 11, 0, 8};
        int arr2[] = {65, 25,6};

        boolean isPresent= false;
        for(int j=0;j<arr2.length;j++) {
           isPresent = searchRecursive(arr2[j], arr1, 0, arr1.length);
      }
      System.out.println(" Is subset "+isPresent);
    }

    private static boolean searchRecursive(int k, int[] arr1, int low, int high) {
        if (low >= high) {
            return false;
        }

        int mid = (low+high)/2;
        if( k == arr1[mid]) {
            System.out.println(" finding element "+k);
            return true;
        }

        return searchRecursive(k, arr1, low, mid) || searchRecursive(k, arr1, mid + 1, high);


    }
}
