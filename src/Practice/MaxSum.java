package Practice;

public class MaxSum {
    public static void main (String args[])
    {
        int arr[] = {100, 200, 300, 40};
        int k=2;
        int maxSum = getMaxSum(arr, k);
        System.out.println("Return MaxSum"+maxSum);
    }

    private static int getMaxSum(int[] arr, int k) {

        int index=arr.length;
        int j=0;
        int maxSum=0;
        int temp=0;
        while(index >=0 && j<=k)
        {
           // System.out.println(" Index" +index);
            maxSum=    maxSum+ arr[arr.length-1-j];
            j++;
           // System.out.println("Max Sum "+maxSum);

        }
        temp=maxSum;
        if(maxSum<temp)
            return temp;
       // System.out.println("Max Sum "+maxSum);

        return maxSum;
    }
}
