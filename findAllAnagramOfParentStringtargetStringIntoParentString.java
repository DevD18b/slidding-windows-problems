import java.util.*;
public class findAllAnagramOfParentStringtargetStringIntoParentString {

public static ArrayList<Integer> findPatterns(String str ,String pattern){

   if(pattern.length()>str.length()) return new ArrayList<>();

   char[] strMap =  new char[26];
   char[] patternMap = new char[26];

   for(int i =0; i<pattern.length(); i++){
    strMap[str.charAt(i)-'a']++;
    patternMap[str.charAt(i)-'a']++;
   }
ArrayList<Integer> ans = new ArrayList<>();
if(Arrays.equals(strMap,patternMap)) ans.add(0);
   for(int i = pattern.length(); i<str.length(); i++)
   {
    strMap[str.charAt(i)-'a']++;
    strMap[str.charAt(i-pattern.length())-'a']--;
    if(Arrays.equals(strMap, patternMap)){
    ans.add(i-pattern.length()+1);
    }
   }
   return ans;
}
}
