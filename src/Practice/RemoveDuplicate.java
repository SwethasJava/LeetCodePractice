package Practice;

public class RemoveDuplicate {
    public static void main(String args[])
    {
        System.out.println(" Inside main method");
        int [] arr ={1,2,3,4};
        removeDuplicateArray(0,arr.length, arr);
    }

    private static void removeDuplicateArray(int low, int length, int[] arr) {
        int newArr[] = new int[0];
        int mid = (low+length)/2;
        // Base Case
        /*if(low== length)

        return newArr;*/
       // if (arr[mid] == low || arr[mid] == arr[length] || arr[low] == arr[length])
            // remove duplicate
        }

}
