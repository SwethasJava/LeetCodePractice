package SearchAlgorithms;

public class BinarySearch {
    public static void main(String args[])
    {


        int arr[]={10,20,30,40,50,60,70,80};
        int searchNumber =50;
        int pointerFoundAt = binarySearch(0,arr.length-1,arr,searchNumber);
        System.out.println("Pointer found at "+pointerFoundAt);
    }

    private static int binarySearch(int lowInd, int highInd, int[] arr, int searchNumber) {
        int mid = (lowInd+highInd)/2;


            if(arr[mid]==searchNumber) {

                return mid;
            }
             else if(searchNumber< arr[mid]){


                return binarySearch(lowInd,mid-1, arr,searchNumber);

            }
            else if(searchNumber >  arr[mid])
            {



                return binarySearch(mid+1,highInd, arr,searchNumber);
            }

        System.out.println("  return mid");
            return -1;
          }

}
