
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskTwoTest{

    @Test
    public void testThatPalindromeNumberIsTrue(){
    
    int [] numbers = {45, 0, 8, 0, 45};
    
    assertTrue(TaskTwo.checkPalindrome(numbers));
    
    
    }
    
   @Test
    public void testThatPalindromeNumberIsFalse(){
    
    int [] numbers = {45, 10, 8, 0, 45};
    
    assertFalse(TaskTwo.checkPalindrome(numbers));
    
    
    }    
    
}    
