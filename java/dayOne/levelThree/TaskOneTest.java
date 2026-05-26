
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest{

    @Test
    public void testThatTwoDArrayIsFlattenInToOneArray(){
    
    int [][] numbers = {{9, 0, 7}, 
                        {3, 5, 1}, 
                        {8, 1, 7}, 
                        {9, 9, 6}
                    
                       }; 
    
    int [] expected = TaskOne.flattenTwoDArray(numbers);
        
    int []  actual = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};

    assertArrayEquals(expected, actual);
    
    }
    
    @Test
    public void testThatTwoDArrayIsFlattenInToOneDimetionalArray(){
    
    int [][] numbers = {{9, 0, 7}, 
                        {3, 5, 1}, 
                        {8, 1, 7}, 
                        {9, 9, 6},
                        {5,4,3,2,1},
                        {4 ,7, 9, 0, 5}
                    
                       }; 
    
    int [] expected = TaskOne.flattenTwoDArray(numbers);
        
    int []  actual = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6, 5, 4, 3, 2, 1, 4 ,7, 9, 0, 5};

    assertArrayEquals(expected, actual);
    
    }    
       
 
}  
  



