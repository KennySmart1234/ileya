
import unittest


from task_one import flatten_two_d_array

class TestTaskOne(unittest.TestCase):

    def test_that_two_d_array_is_flatten_in_to_one_array(self):
    
        numbers = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]] 
        
        self.assertEqual(flatten_two_d_array(numbers), [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6])
        
        
    def test_that_two_d_array_is_flatten_in_to_one_dimetional_array(self):
    
        numbers = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6], [5,4,3,2,1], [4 ,7, 9, 0, 5]] 
        
        self.assertEqual(flatten_two_d_array(numbers), [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6, 5, 4, 3, 2, 1, 4 ,7, 9, 0, 5])        
    





