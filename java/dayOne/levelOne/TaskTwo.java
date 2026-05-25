import java.util.Arrays;

public class TaskTwo {

    public static boolean checkPalindrome(int [] numbers){
        
            
           int [] reversedArray = new int [numbers.length];
    
           int start = 0;
           int end = reversedArray.length-1;
        
            while(end >= 0){
                
                reversedArray[start] = numbers[end];

                start++;
                end--;
                
                }
                  
            
                int palindromeNumber = 0;
            for(int count = 0; count < numbers.length; count++){

                if(numbers[count] == reversedArray[count]){
                    palindromeNumber++;}
                  
                 }

                if(palindromeNumber == numbers.length)
                
                    return true; 
                
                else{
                   
                
                } return false;
                 
                
    }

}


