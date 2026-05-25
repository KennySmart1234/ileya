
import java.util.Arrays;

public class TaskThree {

    public static int [] getPerfectSquare(int [] numbers){
        
            int [] perfectSquare = new int [numbers.length];
            
            int index = 0;   
        for(int count = 0; count < numbers.length; count++){

            int number = numbers[count];
            
            if(number >= 0){
              int root = (int)Math.sqrt(number);
              
                if(root * root == number){
                    perfectSquare[index] = number;
                    index++;
                }    
            
          } 
                    
      } int [] result = Arrays.copyOf(perfectSquare, index);
                
      return result;
    }

}



















