import java.util.HashMap;
import java.util.*;
public class longestNonRepeatingCharacter{

    //Given a string S, find the length of the
    // longest substring without repeating characters.


// Example 1:

             // Input:
            // S = "geeksforgeeks"
           // Output:
          // 7
         // Explanation:
        // Longest substring is
      // "eksforg".

      public static int StringWithNoRepeatingCharacter(String str){


        int start  = 0 ;
        // int end = 0;
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int end =0; end<str.length(); end++){
        
            if(map.containsKey(str.charAt(end))){
                start  = Math.max(start, map.get(str.charAt(end))+1);

                
                start++;
            }
            map.put(str.charAt(end) , end);
            maxLen = Math.max(start, end-start+1);
        }

        return maxLen;
      }

      public static int method2(String str){
        HashSet<Character> set = new HashSet<>();

        int end  =0 ;
        int start = 0;
int maxLen = 0;
      while(end<str.length()){
            if(set.add(str.charAt(end))){
               end++;
               maxLen = Math.max(maxLen,end);
            }
            else{
                set.remove(str.charAt(start));
                start++;
            }

        }
        return maxLen;
      }
      



    public static void main(String[] args) {
        System.out.println("Hii world");
    }
}