import java.util.Scanner;
import java.util.ArrayList;

public class CheckOutApp{

    public static void main(String... args){

        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("  What is the your (Customer's) Name: ");
        String customerName = inputCollector.nextLine(); 
        
        System.out.print("  Enter current Date and Time(DD-MM-YY HH:MM:SS): ");
        String dateAndTime = inputCollector.nextLine(); 

           ArrayList<String>  product  = new ArrayList<>();
           ArrayList<Integer> pieaces  = new ArrayList<>();
           ArrayList<Double>  price    = new ArrayList<>();

        String addMoreItem = "yes";
        
        while(!addMoreItem.equalsIgnoreCase("no")){
        
            System.out.print("  What did the user buy?: ");
            String productName = inputCollector.nextLine();
            
            System.out.print("  How many pieaces?: ");
            int pieacesNumber = inputCollector.nextInt();
            
            System.out.print("  How much per unit?: ");
            double unitPrice = inputCollector.nextDouble();
                            inputCollector.nextLine();
                            
            System.out.print("  Add more Item:? ");
                addMoreItem = inputCollector.nextLine();                      
       
        
            product.add(productName);
            pieaces.add(pieacesNumber);
            price.add(unitPrice); 
         
            }


            System.out.print("  Cashier name: ");
            String cashierName = inputCollector.nextLine();
            
            System.out.print("  How much discount will he get: ");
            double discount = inputCollector.nextDouble();  

            System.out.println(); 
            System.out.println("  SEMICOLON STORE\n  MAIN BRANCH"); 
            System.out.println("  LOCATION: 12, VILLAGE HOUSE, SABO YABA LAGOS."); 
            System.out.println("  TEL: 123456789");
            System.out.println("  Date : "+ dateAndTime);
            System.out.println("  Customer Name: " + customerName);  
            System.out.println("  Cashier Name: " + cashierName); 
            
            
            
                   
            System.out.println();
            System.out.println("\t\t========================================");
            System.out.println("\t\tItems\tQTY\tPrice\tTOTAL(NGN)");
            System.out.println("\t\t----------------------------------------");
            
            double priceSum = 0;
            double discountPrice = 0;
            double subTotal = 0;
            
            for(int count = 0; count < product.size(); count++){
            
                System.out.println();
                System.out.print("\t\t" + product.get(count) + "\t");
                System.out.print(         pieaces.get(count) + "\t");
                System.out.print(         price.get(count)   + "\t");
                System.out.print(price.get(count) * pieaces.get(count));
                
                priceSum = price.get(count) * pieaces.get(count);
                subTotal = subTotal + priceSum;
                
                System.out.println();
                System.out.println("\t\t----------------------------------------");
                
                discountPrice = (subTotal * discount / 100);
                
              }
              
              
                System.out.println();
                System.out.println("\t\t\t Sub Total:" + "\t" + subTotal);
                System.out.println("\t\t\t Discount:" + "\t" + discountPrice);
                
                double vat = 17.5 / 100 * subTotal;
                System.out.printf("\t\t\tVAT @ 17.59%%:\t%.2f%n", vat);
                System.out.println("\t\t========================================");
                
                double totalBill = (vat + subTotal - discountPrice);
                System.out.printf("\t\tTotal Bill\t\t%.2f%n: ", totalBill);
                System.out.println("\t\t========================================");
                System.out.printf("\t\tThis Is Not a Receipt Kindly Pay:%.2f%n ", totalBill);
                System.out.println("\t\t========================================");  
                
           
                System.out.println("\n\n\n");
                
                System.out.print("\t\tHow much did the customer give you? ");
                double amountRender = inputCollector.nextDouble();  
                 
                 while(amountRender < totalBill){
                    System.out.printf("\t\tAdd money your total bill is %.2f%n ", totalBill); 
                    System.out.print("\t\tEnter amount again: ");
                    amountRender = inputCollector.nextDouble(); 
                
                    System.out.println();    
                    }
                    
                    System.out.println(); 
                    System.out.println("  SEMICOLON STORE\n  MAIN BRANCH"); 
                    System.out.println("  LOCATION: 12, VILLAGE HOUSE, SABO YABA LAGOS."); 
                    System.out.println("  TEL: 123456789");
                    System.out.println("  Date : "+ dateAndTime);
                    System.out.println("  Customer Name: " + customerName);  
                    System.out.println("  Cashier Name: " + cashierName);   
                    System.out.println("\n"); 
                    System.out.println("\t\t----------------------------------------"); 
                    System.out.printf("\t\tTotal Bill\t\t%.2f%n ", totalBill);
                    System.out.println("\t\t========================================");
                    System.out.println("\t\tAmount Paid\t\t" + amountRender);
                    System.out.println("\t\t========================================");
                    System.out.println("\t\tBalance\t\t\t" + (amountRender - totalBill));
                    System.out.println("\t\t----------------------------------------");
                    System.out.println("\n");  
                     

    }


}


