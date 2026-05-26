
def flatten_two_d_array(numbers):
    
    new_list = []
    
    for row in numbers:
    
        for number in row:
        
            new_list.append(number)
    return new_list 


