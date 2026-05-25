import math

def get_Perfect_square(numbers):

    Perfect_square_list = []   
    
    for number in numbers:
    
        if number >= 0:
        
            root = int(math.sqrt(number))
            
            if root * root == number:
            
                Perfect_square_list.append(number) 

    return Perfect_square_list 



