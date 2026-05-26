
import unittest


from task_three import merging_two_arrays

class TestTaskThree(unittest.TestCase):

    def test_that_merging_two_arrays_from_one_to_six(self):
    
        numbers = [3, 5, 1], [2, 4, 6]  
        
        self.assertEqual(merging_two_arrays(numbers), [1, 2, 3, 4, 5, 6])
        
        
    def test_that_merging_five_arrays_is_working_correctly(self):
    
        numbers = [10,11,12,13,14,], [1,2,3,4,5], [15,17,20], [22,33,44,55,66], [6,7,8,9]
        
        self.assertEqual(merging_two_arrays(numbers), [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,20,22,33,44,55,66])        
    





