import java.util.Arrays;

public class TaskOne {

    public static int [] checkMostAppearedValue(int [] numbers){
        
            
           int [] mostAppearedNumber = new int [numbers.length];
   
                 int index = 0;
            for(int count = 0; count < numbers.length; count++){
                             
                for(int countTwo = count+1; countTwo< numbers.length; countTwo++){
            
                    if(numbers[count] == numbers[countTwo]){
                       mostAppearedNumber[index] = numbers[count]; 
                        index ++;
                        
                        }
                        
                    }
                     
                 }
                 int [] result = Arrays.copyOf(mostAppearedNumber, index); 
                 
                 return result;
                                 
    }




}

