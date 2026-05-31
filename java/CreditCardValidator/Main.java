
import java.util.Scanner;
import java.util.ArrayList;
public class MainCreditCardValidator{

    public static void main(String... args){ 
    
        Scanner inputCollector = new Scanner(System.in);


    System.out.print("Hello, Kindly Enter Card details to verify: ");
    long cardNumber = inputCollector.nextLong();

        System.out.println("\t\t");
        System.out.println("******************************************");
        System.out.println("** Credit Card " + CreditCardValidator.cardType(cardNumber));
        System.out.println("** Credit Card Number: " + cardNumber);
        System.out.println("** Credit Card Digit Length: " + CreditCardValidator.cardLength(cardNumber));                     
        System.out.println("** Credit Card Validity status: " + CreditCardValidator.validatingCard(cardNumber));
        System.out.println("******************************************");
              
           

    }

}

