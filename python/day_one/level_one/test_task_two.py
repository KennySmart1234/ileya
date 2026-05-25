
import unittest


from task_two import check_palindrome

class TestTaskTwo(unittest.TestCase):


    def test_that_the_palindrome_function_to_working_correctly_return_true(self):
    
        numbers = [45, 0, 8, 0, 45]
        
        self.assertEqual(check_palindrome(numbers), True)
        
        
    def test_that_the_palindrome_function_to_working_correctly_return_false(self):
    
        numbers = [45, 10, 8, 0, 45]
        
        self.assertEqual(check_palindrome(numbers), False)

