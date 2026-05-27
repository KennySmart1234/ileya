
import unittest 

import book_suggestion_system

class TestBookSuggestionSystem(unittest.TestCase):

    def test_that_book_can_be_added(self):
    
        book_suggestion_system.add_book("The young shall grow")
        self.assertIn("The young shall grow", book_suggestion_system.show_book())
        
        
    def test_that_duplicate_book_cannot_be_added(self):
    
        result = book_suggestion_system.add_book("The young shall grow")
        self.assertEqual(result, "Book already exists.")
        
        
    def test_that_book_can_be_removed(self):
    
        book_suggestion_system.add_book("Life journey")
        result = book_suggestion_system.remove_book("Life journey")

        self.assertEqual(result, "Book removed succefully!." ) 
        
        
    def test_that_book_that_does_not_exist_cannot_be_removed(self):
    
        result = book_suggestion_system.remove_book("The legend boy")

        self.assertEqual(result, "Book does not exist." )           
        
        
    def test_that_book_can_be_updated(self):
    
        book_suggestion_system.add_book("Best Time")
        result = book_suggestion_system.update_book("Best Time", "Village boys and girls")

        self.assertEqual(result, "Book updated succefully!")  
        
        
    def test_that_book_that_does_not_exist_cannot_be_updated(self):

        result = book_suggestion_system.update_book("Semicolon", "Village")

        self.assertEqual(result, "Book does not exist.") 
        
    def test_that_book_that_all_books_count_is_accurate(self):
        
        books = book_suggestion_system.show_book()
        book_count = (len(books))
        result = book_suggestion_system.show_book()

        self.assertEqual(book_count, len(result))  
        
        
        
        
        
