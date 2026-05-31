
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest{


    @Test
    public void testThatCardLengthIsSixteenDigit(){
    
    long cardNumber = 6388576018410704l;
    
    int expected = CreditCardValidator.cardLength(cardNumber);
    
    int actual = 16;
    
    assertEquals(expected, actual);
    
    
    }
    

    @Test
    public void testThatCardStartingWithFourIsVisaCard(){
    
    long cardNumber = 4388576018410704l;
    
    String expected = CreditCardValidator.cardType(cardNumber);
    
    String actual = "Visa Card";
    
    assertEquals(expected, actual);
    
    }    

    @Test
    public void testThatCardStartingWithFiveIsMasterCard(){
    
    long cardNumber = 5388576018410704l;
    
    String expected = CreditCardValidator.cardType(cardNumber);
    
    String actual = "Master Card";
    
    assertEquals(expected, actual);
    
    }    
    
    @Test
    public void testThatCardStartingWithSixIsDiscoverCard(){
    
    long cardNumber = 6388576018410704l;
    
    String expected = CreditCardValidator.cardType(cardNumber);
    
    String actual = "Discover card";
    
    assertEquals(expected, actual);
    
    }    
    
    
    @Test
    public void testThatCardNumberIsValid(){
    
    long cardNumber = 4388576018410707l;
  
    String expected = CreditCardValidator.validatingCard(cardNumber);
    
    String actual = "Valid card";
    
    assertEquals(expected, actual);
    
    }        
 
    @Test
    public void testThatCardNumberIsNotValid(){
    
    long cardNumber = 4388576018402626l;
    
    String expected = CreditCardValidator.validatingCard(cardNumber);
    
    String actual = "Invalid card";
    
    assertEquals(expected, actual);
    
    }              
    
}









