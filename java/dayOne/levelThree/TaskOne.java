import java.util.Arrays;

public class TaskOne {

    public static int [] flattenTwoDArray(int [][] numbers){

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
   
        return newArray;
                                  
    }

}

