public class SmallestSubArrayGreaterThenOrEqualGivenTarget {
    //   int[] input = new int[]{4,2,2,7,8,1,2,8,10};
    // int targetSum = 8;

    public static int findMinWindow(int [] arr , int target){

        // mujhe target tk jana hai toh
        // mujhe sum generate krna hoga.
        int start = 0;
        int sum = 0;
        int minWindowSize = 0;
        for(int end = 0; end<arr.length; end++){
            sum+=arr[end];

            while(sum>=target){
               minWindowSize = Math.min(minWindowSize, end-start+1);
               sum-=arr[start];
               start++;
            }
        }

        return minWindowSize;



    }




}
