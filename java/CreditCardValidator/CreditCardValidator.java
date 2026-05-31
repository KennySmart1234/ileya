
import java.util.ArrayList;

public class CreditCardValidator{


    public static int cardLength(long cardNumber){
    
        ArrayList<Long> cardDigit = new ArrayList<>();
        
        for(long count = cardNumber; 0 < count; count/=10){
        
            cardDigit.add(count % 10);
            
        }
            return cardDigit.size();
    }    



    public static String cardType(long cardNumber){
    
        ArrayList<Long> cardDigit = new ArrayList<>();
        
        for(long count = cardNumber; 0 < count; count/=10){
        
            cardDigit.add(count % 10);    
            
            } 
        
            if(cardDigit.get(cardDigit.size()-1) == 4){
               return "Visa Card";}
               
            else if(cardDigit.get(cardDigit.size()-1) == 5){
               return "Master Card"; }
               
            else if(cardDigit.get(cardDigit.size()-1) == 6)
               return "Discover card";
               
             else{
                  return "No type Discover";
             }  
    }    




    public static String validatingCard(long cardNumber){
    
        ArrayList<Long> cardDigit = new ArrayList<>();
        
        for(long count = cardNumber; 0 < count; count/=10){
        
            cardDigit.add(count % 10);
        
        }
        
            int evenIndexSum = 0;
         for(int index = 0; index < cardDigit.size(); index +=2){
             
            evenIndexSum += cardDigit.get(index); 
         
         } 
        
            long oddIndexSum = 0;
         for(int index = 1; index < cardDigit.size(); index +=2){
            
               long oddIndex =  (2 * cardDigit.get(index));

                if(oddIndex > 9)
                    for(long count = oddIndex; 0 < count; count /= 10){
                    
                    oddIndexSum = oddIndexSum + (count % 10);    
                    
                    }
                    
                else{
                
                    oddIndexSum = oddIndexSum + oddIndex; 
         
                    }
            } 
        
            long evenAndOddSum = (evenIndexSum + oddIndexSum);
            if(evenAndOddSum % 10 == 0)
                return "Valid card";    
            else{
                return "Invalid card";
            }

    }   
    

}    
