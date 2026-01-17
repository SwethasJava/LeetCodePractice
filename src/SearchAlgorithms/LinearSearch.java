package SearchAlgorithms;

public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = {65, 25, 12, 22, 11};
        int search = 22;
        int pointer=0;
        for (int i = 0; i < arr.length; i++) {
            if(search== arr[i])
            {
                //System.out.println("Found "+search);
                pointer=i;
                break;
            }

        }
        System.out.println("Found: "+search + "Pointer : "+  pointer);
    }

}
