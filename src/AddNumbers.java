public class AddNumbers {
    public static void main(String args[])
    {
        int[] nums = {3,2,3};
        int target = 6;
        int [] output;
        output=twoSum(nums,target);
        System.out.println("Output" +output[0]+output[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        int j[]={0,1};

        for (int i=0;i<nums.length;i++)
        {
            for (int k=1;k<=nums.length-1;k++) {

                if (nums[i] + nums[k] == target) {
                    j[0] = i;
                    j[1] = k;
                    System.out.println("i " + i);
                    System.out.println("k " + k);
                    break;
                }
            }


        }
        return j;
    }
}


