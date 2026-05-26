import java.util.Arrays;

public class TaskThree {

    public static int [] swappingOfZeros(int [] numbers){
        
            
           int [] swappedNumbers = new int [numbers.length];
   
                int index = 0;
            for(int count = 0; count < numbers.length; count++){
            
                    if(numbers[count] != 0){
                       swappedNumbers[index] = numbers[count]; 
                        index++;
                        }

                    }
                 
                 return swappedNumbers;
                                 
    }

}
 
