
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskThreeTest{

    @Test
    public void testThatMergingTwoArraysFromOneToSix(){
    
    int [][] numbers = {{3, 5, 1}, 
                        {2, 4, 6}
                        
                       }; 
    
    int [] expected = TaskThree.mergingTwoArrays(numbers);
        
    int []  actual = {1, 2, 3, 4, 5, 6};

    assertArrayEquals(expected, actual);
    
    }
    
    @Test
    public void testThatMergingArraysIsWorkingCorrectly(){
    
    int [][] numbers = {{10,11,12,13,14}, 
                        {1,2,3,4,5}, 
                        {15,17,20}, 
                        {22,33,44,55,66}, 
                        {6,7,8,9}
                    
                       }; 
    
    int [] expected = TaskThree.mergingTwoArrays(numbers);
        
    int []  actual = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,20,22,33,44,55,66};

    assertArrayEquals(expected, actual);
    
    }    
       
 
}  
  



