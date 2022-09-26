import java.util.*;


public class BinarySubArrayWithSum {

    // this problem is variation yaa fir 
    // sidhe sidhe bolu  toh yeh variation hai kiska ????
    // maximum sum array sum equal to target. kaa jo ki Map
    // keh jariye hoo jaa rha hoota hai.
    public static int findSum(int [] arr , int goal){

        HashMap<Integer,Integer>map = new HashMap<>();
         map.put(0,1);
        int sum = 0;
        int count  = 0;
        for(int  i =0; i<arr.length; i++){
            sum+=arr[i];

            int currSum = sum-goal;

            if(map.containsKey(currSum)){
                  count+=map.get(currSum);                
            }
            else{
               map.put(sum,map.getOrDefault(sum, 0)+1);
            }
        }
return count;

        
    }
    
}
