

import unittest


from task_one import check_most_appeared_value

class TestTaskOne(unittest.TestCase):


    def test_to_hecck_most_appeared_value_is_working_correctly(self):
    
        numbers = [1, 2, 3, 2, 4, 3]
        
        self.assertEqual(check_most_appeared_value(numbers), [2, 3])
        
        
    def test_to_checck_most_appeared_value_from_one_to_fifteen(self):
    
        numbers = [ 1, 9, 7, 4, 0, 13, 7, 8, 9, 10, 0, 12, 13, 4, 15 ]
        
        self.assertEqual(check_most_appeared_value(numbers), [9, 7, 4, 0, 13])

