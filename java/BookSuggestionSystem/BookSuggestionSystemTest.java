import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class BookSuggestionSystemTest{


    @Test
    public void testThatBookCanBeAdded(){
    
    ArrayList<String> books = BookSuggestionSystem.bookStore();
    
    String bookTitle = "Solid Life";
    
    String expected = BookSuggestionSystem.addBook(books, bookTitle);
    
    String actual = "Book added succefully";
    
    assertEquals(expected, actual);
    
    
    
    }
    
    
    @Test
    public void testThatBookThatAlreadyExistCanNotBeAddedAgain(){
    
    ArrayList<String> books = BookSuggestionSystem.bookStore();
    
    String bookTitle = "Brave kingdom";
    
    String expected = BookSuggestionSystem.addBook(books, bookTitle);
    
    String actual = "Book already exist";
    
    assertEquals(expected, actual);
    
    
    
    }  
    
    
    
    @Test
    public void testThatBookThatDoesNotExistCanNotBeRemove(){
    
    ArrayList<String> books = BookSuggestionSystem.bookStore();
    
    String bookTitle = "Semicon Diary";
    
    String expected = BookSuggestionSystem.removeBook(books, bookTitle);
    
    String actual = "Book does not exist";
    
    assertEquals(expected, actual);
    

    } 
    
           
    @Test
    public void testThatBookCanBeRemoved(){
    
    ArrayList<String> books = BookSuggestionSystem.bookStore();
    
    String bookTitle = "The Hobbit";
    
    String expected = BookSuggestionSystem.removeBook(books, bookTitle);
    
    String actual = "Book removed succefully";
    
    assertEquals(expected, actual);
    

    }
    
    @Test
    public void testThatBookCanBeUpdated(){
    
    ArrayList<String> books = BookSuggestionSystem.bookStore();
    
    String oldBookTitle = "The Hobbit";
    
    String newBookTitle = "The Good Time";
    
    String expected = BookSuggestionSystem.updateBook(books, oldBookTitle, newBookTitle);
    
    String actual = "Book updated succefully!";
    
    assertEquals(expected, actual);
    

    }  
    
    
    
    @Test
    public void testThatBookThatDoesNotExistCanNotBeUpdated(){
    
    ArrayList<String> books = BookSuggestionSystem.bookStore();
    
    String oldBookTitle = "Life is easy";
    
    String newBookTitle = "Life is Hard";
    
    String expected = BookSuggestionSystem.updateBook(books, oldBookTitle, newBookTitle);
    
    String actual = "Book does not exist.";
    
    assertEquals(expected, actual);
    

    }         


}
