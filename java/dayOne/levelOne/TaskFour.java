
import java.util.Arrays;
public class TaskFour {

    public static int [] getPerfectSquare(int [] numbers){
        
            int [] perfectSquare = new int [numbers.length];

        for(int count = 0; count < numbers.length; count++){

            int number = numbers[count];
            
            if(number >= 0){
              int root = (int)Math.sqrt(number);
              
                if(root * root == number){
                    perfectSquare[count] = number;

                }  
                else{
                    perfectSquare[count] = -1;

                }     
            
          } 
                    
      } 
                
      return perfectSquare;
    }

}



















