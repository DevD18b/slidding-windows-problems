public class maximumSumSubArrayOfSizeK {
    public static int maximizeSum(int [] arr , int k){


        int ans = Integer.MIN_VALUE;
           int currentSumSoFar  =  0;
        for(int i = 0; i<arr.length;i++){
            currentSumSoFar+=arr[i];
            if(i>=k-1){
                ans = Math.max(currentSumSoFar, ans);
                currentSumSoFar-=arr[i-(k-1)];
            }
        }
        return ans;






    }
}
