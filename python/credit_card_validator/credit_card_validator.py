

def card_length(card_number):

    card_digit = []
    
    for digit in str(card_number):
        card_digit.append(int(digit))    
    
    return len(card_digit)
        
   

def card_type(card_number):

    card_digit = []
    
    for digit in str(card_number):
        card_digit.append(int(digit)) 
        
    if(card_digit[0] == 4):
        return "Visa Card"
       
    elif(card_digit[0] == 5):
        return "Master Card"
       
    elif(card_digit[0] == 6):
        return "Discover card"
       
    else:
        return "No type Discover"
        


def validating_card(card_number):

    card_digit = []
    
    for digit in str(card_number):
        card_digit.append(int(digit))         

    odd_index_sum = 0;

    for digit in range(1, len(card_digit), 2):

        odd_index_sum += card_digit[digit] 
        
            

    even_index_sum = 0;

    for digit in range(0, len(card_digit), 2):

        even_index =  2 * (card_digit[digit])

        if even_index > 9:
        
            for number in str(even_index):
                number = int(number)    
                even_index_sum = even_index_sum + (number % 10)  

        else:
        
            even_index_sum = even_index_sum + even_index
 

    even_and_odd_sum = (even_index_sum + odd_index_sum);
    
    if even_and_odd_sum % 10 == 0:
            
        return "Valid card"
    else:

        return "Invalid card"

