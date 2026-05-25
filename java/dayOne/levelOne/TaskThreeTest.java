

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskThreeTest{

    @Test
    public void testThatPerfectSquareNumberIsWorkingCorrectly(){
    
    int [] numbers = {4, 7, 9, 10, 16, 18};
    
    int [] actual = TaskThree.getPerfectSquare(numbers);
        
    int [] expected = {4,9,16};

    assertArrayEquals(expected, actual);
    
    }
    
    
   @Test
    public void testThatPerfectSquareBetweenOneToFourtyIsWorkingCorrectly(){
    
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                      11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                      21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                      31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
    
    
    int [] expected = {1, 4, 9, 16, 25, 36};
    int [] actual = TaskThree.getPerfectSquare(numbers);
    
    
    assertArrayEquals(expected, actual);
    
    }  
    
}  
