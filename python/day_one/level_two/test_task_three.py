

import unittest


from task_three import swapping_of_zeros

class TestTaskThree(unittest.TestCase):


    def test_that_all_zeros_numbers_in_the_list_are_at_the_back(self):
    
        numbers = [5, 0 , 3, 0, 2, 0]
        
        self.assertEqual(swapping_of_zeros(numbers), [5, 3, 2, 0, 0, 0])
        
        
    def test_that_all_zeros_values_in_the_list_are_at_the_back(self):
    
        numbers = [ 0, 10 , 3, 0, 2, 0, 8, 0, 13, 6, 0, 0, 2, 66, 0]
        
        self.assertEqual(swapping_of_zeros(numbers), [10 , 3, 2, 8, 13, 6, 2, 66, 0, 0, 0, 0, 0, 0, 0])

