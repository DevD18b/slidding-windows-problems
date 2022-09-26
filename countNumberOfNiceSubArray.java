public class countNumberOfNiceSubArray {

    // Given an array of integers nums and an integer
    /// k. A continuous subarray is called nice if there are k odd numbers on it.

    // Return the number of nice sub-arrays.
    
     
    
    // Example 1:
    
    // Input: nums = [1,1,2,1,1], k = 3
    // Output: 2
    // Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1]
    //and [1,2,1,1].
    
 // approach to solve this problem is very out very transparent and that is slidding window.
 // we just need to think how we can maintaint the odd number count.
 
 
public static int niceSubArray(int [] arr , int k){

int start = 0;
int odd = 0;
int newSubArray  =0;
int maxLen = 0;
int end  = 0;
   while(end<arr.length){
        if(arr[end]%2==1){
             odd++;               
             newSubArray =0 ;
        }
        while(odd>=k){
            newSubArray++;
           if(arr[start]%2==1){
            odd--;
           }
           start++;
        }
   maxLen+=newSubArray;
   end++;
    }
    return maxLen;


 }



    
}
