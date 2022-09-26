public class minSwapsInorderToGetAllOnesTogether {
    public static int countOnes(int [] arr){

int totalCount  = 0 ;
int start = 0;
int end  = 0 ;

for(int i : arr){
    totalCount+=i;
}
if(totalCount==0) return-1;
int currentCount  = 0 ;
int maxCount = 0;

while(end!=arr.length){
currentCount+=arr[end];
if((end-start+1)==arr.length){
    maxCount = Math.max(currentCount, maxCount);
    if(arr[start]==1){
        currentCount--;
    }
    start++;
}
end++;
}
return totalCount-maxCount;





    }
}
