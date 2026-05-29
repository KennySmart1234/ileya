import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class BookSuggestionSystem{

    public static ArrayList<String> bookStore( ){
    
        String [] books = {"The Mystery", 
                           "Student Life", 
                           "Poor Dad, Rich dad", 
                           "Growth Mindset",
                           "The Hobbit", 
                           "Animal Farm", 
                           "Brave kingdom", 
                           "Peaceful Life"};
 
            ArrayList<String> allBookList = new ArrayList<>(Arrays.asList(books)); 

        return allBookList;
    
    }

    public static String suggestBook(ArrayList<String> bookList){

        Random randomCollector = new Random();
        
        int randomNumber = randomCollector.nextInt(1, 100);
        
        int randomIndex = randomCollector.nextInt(bookList.size());
            String bookSuggetion = bookList.get(randomIndex);
        
        return String.format("Book Title: %s %nPasge: %d%n", bookSuggetion, randomNumber );
        
        } 
        
        
    public static String addBook(ArrayList<String> bookStore, String bookTitle){
                        
            if (bookStore.contains(bookTitle)){

                return "Book already exist";
                }
            else{

                    bookStore.add(bookTitle);                    
                return "Book added succefully";
            }
        } 
        
    public static String removeBook(ArrayList<String> bookStore, String bookTitle){
    
            if (!bookStore.contains(bookTitle)){

                return "Book does not exist";
                }
            else{

                    bookStore.remove(bookTitle);                    
                return "Book removed succefully";
            }
        } 
        
        
    public static String updateBook(ArrayList<String> bookStore, String oldBookTitle, String newBookTitle){
    
            if (bookStore.contains(oldBookTitle)){
                int index = bookStore.indexOf(oldBookTitle);
                    bookStore.set(index, newBookTitle);
        
        return "Book updated succefully!";
        }
    else{
        return "Book does not exist.";                         
        }
        
  } 
  
  
    public static String showBooks(ArrayList<String> bookStore){
    
            String allBooks = "";
            int count = 1;
            for(String book : bookStore){
            
                allBooks += String.format("%d. %s\n", count, book);
                count++;
            }
              return allBooks;
  
  }


}

