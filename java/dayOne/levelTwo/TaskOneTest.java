

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest{

    @Test
    public void testToChecckMostAppearedValueIsWorkingCorrectly(){
    
    int [] numbers = {1, 2, 3, 2, 4, 3};
    
    int [] actual = TaskOne.checkMostAppearedValue(numbers);
        
    int [] expected = {2,3};

    assertArrayEquals(expected, actual);
    
    }
    
    
   @Test
    public void testToChecckMostAppearedValueFromOneToFifteen(){
    
    int [] numbers = {1, 9, 7, 4, 0, 13, 7, 8, 9, 10, 
                      0, 12, 13, 4, 15 };
    
    int [] expected = {9, 7, 4, 0, 13};
    int [] actual = TaskOne.checkMostAppearedValue(numbers);
    
    
    assertArrayEquals(expected, actual);
    
    }  
    
   @Test
    public void testToChecckMostAppearedNumbers(){
    
    int [] numbers = {1, 9, 7, 4, 9, 13, 7, 8, 10, 
                      0, 12, 13, 4, 15 , 8, 6};
    
    int [] expected = {9, 7, 4, 13, 8};
    int [] actual = TaskOne.checkMostAppearedValue(numbers);
    
    
    assertArrayEquals(expected, actual);
    
    }      
//    
}  
