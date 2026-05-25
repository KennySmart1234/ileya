
import unittest


from task_one import get_even_and_odd

class TestTaskOne(unittest.TestCase):


    def test_that_the_function_to_working_correctly(self):
    
        numbers = [45, 60, 3, 10, 9, 22]
        
        self.assertEqual(get_even_and_odd(numbers), [[60, 10, 22], [45, 3, 9]])
        
        
    def test_that_to_separate_even_and_odd_list_is_working_correctly(self):
    
        numbers = [45, 50, 60, 3, 10, 9, 2, 99, 22]
        
        self.assertEqual(get_even_and_odd(numbers), [[50, 60, 10, 2, 22], [45, 3, 9,99]])





