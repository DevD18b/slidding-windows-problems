
public class dietPlanPerformance {

    public static int caloriesGained(int [] calories , int k , int lower , int higher){

        int pointers = 0;

        int sum = 0;

        for(int i= 0;  i<k; i++){
            sum+=calories[i];
            if(sum<lower){
               pointers--;
            }
            if(sum>higher){
             pointers++;
            }
        }
        for(int i = k; i<calories.length; i++){

           sum += calories[i]-calories[i-k];
      
          if(sum>higher) pointers++;
         else if(sum<lower)
         pointers--;
        }


        return pointers;



    }
}
