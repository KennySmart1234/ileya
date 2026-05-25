
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskOneTest{

    @Test
    public void testThatGetEvenAndOddNumberFunctionIsWorkingCorrectly(){
    
    int [] numbers = {45,  60,  3,  10, 9,  22};
    
    int [][] expected = TaskOne.getEvenAndOdd(numbers);
    
    int [][] actual = {{60, 10, 22}, {45, 3, 9}};
    
    assertArrayEquals(expected, actual);
    
    }
    
    
    
    @Test
    public void testThatGetEvenAndOddNumberIsWorkingCorrectly(){
    
    int [] numbers = {38,  20,  5, 31, 11, 29, 26, 2, 55};
    
    int [][] expected = TaskOne.getEvenAndOdd(numbers);
    
    int [][] actual = {{38, 20, 26, 2}, {5, 31, 11, 29, 55}};
    
    assertArrayEquals(expected, actual);
    
    }    





}




