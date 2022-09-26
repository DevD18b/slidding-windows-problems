import java.util.*;
public class longestNonRepeatingKLengthString {

    // this is variation of previous problem we are given k value here 
    // which has to be maintained by us. such that there is no 
    // repeating character inside that.

    public static int solve(String str , int k){

        HashMap<Character , Integer> map  = new HashMap<>();

        int start  = 0;
        int maxLength  = 0;

        for(int end = 0;
        end<str.length(); end++){
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0)+1);
            
            while(map.size()>k){
                char left = str.charAt(start);
                map.put(left, map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                start++;
            }
            maxLength = Math.max(maxLength , end - start+1);
        }
        return maxLength;






    }
    
}
