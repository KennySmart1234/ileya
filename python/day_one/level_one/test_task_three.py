
import unittest


from task_three import get_Perfect_square

class TestTaskThree(unittest.TestCase):


    def test_that_the_get_Perfect_square_function_to_working_correctly(self):
    
        numbers = [4, 7, 9, 10, 16, 18]
        
        self.assertEqual(get_Perfect_square(numbers), [4, 9, 16])
        
        
    def test_that_the_get_Perfect_square_from_one_to_fourty_function_to_working_correctly(self):
    
        numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                      11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                      21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                      31, 32, 33, 34, 35, 36, 37, 38, 39, 40]
        
        self.assertEqual(get_Perfect_square(numbers), [1, 4, 9, 16, 25, 36])

