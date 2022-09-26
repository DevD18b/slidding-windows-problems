public class kFlipsToMakeMaximumOnesTother {
    // Given a binary array nums and 
    // an integer k, return
    //  the maximum number of consecutive 
    //  1's in the array if you can flip at most k 0's.

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2

public static int count(int [] arr , int k){
int start = 0;
int end  =0;
int zeroCount  =0;
int ans =  0;
while(end<arr.length){
    if(arr[end]==0){
        zeroCount++;
    }
    while(zeroCount>=k){
        if(arr[start]==0)
        {
            zeroCount--;
        }
        start++;
    }
    ans = Math.max(ans , end-start+1);
     end++;
     
}

return ans;



}


}
