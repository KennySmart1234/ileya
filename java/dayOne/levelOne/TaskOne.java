import java.util.Arrays;

public class TaskOne {

    public static int[][] getEvenAndOdd(int [] numbers){
        
            int [] evenNumber = new int [numbers.length];
            int [] oddNumber = new int [numbers.length];
            
            int evenIndex = 0;
            int oddIndex = 0;
   
        for(int number : numbers){
            
            if(number % 2 == 0){
               evenNumber[evenIndex] = number;
               evenIndex++;
                               }
              
           else{
               oddNumber[oddIndex] = number;
               oddIndex++;
               }      
        
                                } 
                                
             int [] finalEven = Arrays.copyOf(evenNumber, evenIndex);
             int [] finalOdd = Arrays.copyOf(oddNumber, oddIndex); 
    
             int [][] result = {finalEven, finalOdd};
                
                return result;
    }

public static void main(String... args){


int [] numbers = {45,  60,  3,  10, 9,  22}; 

int [][] result = getEvenAndOdd(numbers);

System.out.print(Arrays.deepToString(result));

    }

}


