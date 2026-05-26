
import java.util.Arrays;

public class TaskThree {

    public static int [] mergingTwoArrays(int [][] numbers){

        int rowLength = 0; 
            
        for(int [] row : numbers){
            
            rowLength = rowLength + row.length; 

            }
        
        
            int [] newArray = new int [rowLength];
        
            int index = 0;
            
        for(int [] row : numbers){
        
            for(int number : row){
            
                newArray[index] = number;
                 
                 index++;
            }
 
        }
   
        for(int row = 0; row < newArray.length; row++){
            for(int count = row + 1; count < newArray.length; count++){
                
                int temporary = newArray[row];
                if(newArray[count] < newArray[row]){
                   newArray[row] = newArray[count];
                   newArray[count] = temporary; 
                   
                }
            
            
            }
        
        }    
   
        return newArray;
                                  
    }

}

