public class maximumAverageSubArray {
    public static double maxAverageSum(int [] arr , int k){

        double res = 0;
        int sum = 0;

        for(int i =0; i<k; i++){
            sum+=arr[i];
        }

        for(int i = k; i<arr.length; i++){
             sum+=arr[i]-arr[i-k];
             res = Math.max(sum, res);
        }
        return res/k;

    }
    public static int sliddingWindow(int [] arr , int k){
        int start  = 0;
        int sum =0 ;
        int ans  = 0;
        for(int end =0; end<arr.length; end++){
            sum+=arr[end];
           
            if(end>=k-1){
             ans  = Math.max(ans, sum);
             sum-=arr[start];
             start++;
            }
        }
        return ans;






    }
    
}
