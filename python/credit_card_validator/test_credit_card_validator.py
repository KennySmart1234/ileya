import unittest 

import credit_card_validator

class TestCreditCardValidator(unittest.TestCase):
        
        
    def test_that_card_length_is_sixteen_digit(self):
    
        cardNumber = 6388576018410704
    
        result = credit_card_validator.card_length(cardNumber)
        self.assertEqual(result, 16)
        
        
    def test_that_card_starting_with_four_is_visa_vard(self):
    
        cardNumber = 488576018410704
    
        result = credit_card_validator.card_type(cardNumber)
        self.assertEqual(result, "Visa Card")        
        
        
        
    def test_that_card_starting_with_five_is_master_card(self):
    
        cardNumber = 5388576018410704
    
        result = credit_card_validator.card_type(cardNumber)
        self.assertEqual(result, "Master Card") 
        
        
    def test_that_card_starting_with_six_is_discover_card(self):
    
        cardNumber = 6388576018410704
    
        result = credit_card_validator.card_type(cardNumber)
        self.assertEqual(result, "Discover card")


    def test_that_card_number_is_valid(self):
    
        cardNumber = 4388576018410707
    
        result = credit_card_validator.validating_card(cardNumber)
        self.assertEqual(result, "Valid card")
        
        
    def test_that_card_number_is_not_valid(self):
    
        cardNumber = 4388576018402626
    
        result = credit_card_validator.validating_card(cardNumber)
        self.assertEqual(result, "Invalid card")    
        
        

