
import java.util.Scanner;
import java.util.ArrayList;
public class MainBookSuggestionSystem{

    public static void main(String... args){ 
    
        Scanner inputCollector = new Scanner(System.in);
        ArrayList<String> books = BookSuggestionSystem.bookStore();
String message ="""

            ===== Welcome to the Book Suggestion System! =====

1. Get Suggestions
2. Add Book
3. Remove Book
4. Update book
5. Show all books
6. Exit: 

               """;


while(true){

    System.out.print(message + "Enter operation: ");
    int option = inputCollector.nextInt();
    inputCollector.nextLine();

    switch(option){
    
        case 1:
          
            while(true){
                System.out.println(BookSuggestionSystem.suggestBook(books));

                System.out.print("Would you like to get another suggestion? (yes/no): ");
                String userChoice = inputCollector.nextLine();
            
                if(userChoice.equalsIgnoreCase("no")){
                    break; 
                
                } 
                
              } break;
                
        case 2:                
            System.out.print("Enter the book title: ");
            String bookTitle = inputCollector.nextLine();
            
            System.out.print(BookSuggestionSystem.addBook(books, bookTitle));
                break;
                

        case 3:                
            System.out.print("Enter the book title to remove: ");
            String removeBookTitle = inputCollector.nextLine();
            System.out.print(BookSuggestionSystem.removeBook(books, removeBookTitle));
                break;
                
                
                
        case 4:                
            System.out.print("Enter the old title: ");
            String oldBookTitle = inputCollector.nextLine();
            
            System.out.print("Enter the new title: ");
            String newBookTitle = inputCollector.nextLine();
            System.out.print(BookSuggestionSystem.updateBook(books, oldBookTitle, newBookTitle));
                break;                                 
                
                
        case 5:                
            System.out.println("All books");
            System.out.println();
            System.out.print(BookSuggestionSystem.showBooks(books));
                break;
           
        
                  
            }
          if(option == 6)
                break;
        }

    }

}
