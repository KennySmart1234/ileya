

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskThreeTest{

    @Test
    public void testThatAllZerosNumbersInTheArrayAreAtheBack(){
    
    int [] numbers = {5, 0 , 3, 0, 2, 0};
    
    int [] expected = TaskThree.swappingOfZeros(numbers);
        
    int [] actual = {5, 3, 2, 0, 0, 0};

    assertArrayEquals(expected, actual);
    
    }
    
    
    @Test
    public void testThatAllZerosValuesInTheArrayAreAtheBack(){
    
    int [] numbers = {0, 10 , 3, 0, 2, 0, 8, 0, 13, 6, 0, 0, 2, 66, 0};
    
    int [] expected = TaskThree.swappingOfZeros(numbers);
        
    int [] actual = {10 , 3, 2, 8, 13, 6, 2, 66, 0, 0, 0, 0, 0, 0, 0};

    assertArrayEquals(expected, actual);
    
    }    
    
    
}
    

