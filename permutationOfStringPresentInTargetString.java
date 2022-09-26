import java.util.Arrays;

public class permutationOfStringPresentInTargetString {
    
    public static boolean permutation(String target , String parent){

        int [] targetMap = new int[26];
        int [] parentMap = new int[26];

        for(int i =0; i<target.length(); i++){
            targetMap[target.charAt(i)-'a']++;
            parentMap[parent.charAt(i)-'a']++;
        }

        if(Arrays.equals(targetMap,parentMap)) return true;

        for(int i =  target.length(); i<parent.length(); i++){
            parentMap[parent.charAt(i)-'a']++;
            parentMap[parent.charAt(i-target.length())-'a']++;
            if(Arrays.equals(targetMap,parentMap)) return true;
        }
        return Arrays.equals(targetMap , parentMap);
    }
}
