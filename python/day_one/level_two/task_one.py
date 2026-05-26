

def check_most_appeared_value(numbers):

    new_list = []
    
    for numberOne in numbers:

        count = 0
        
        for numberTwo in numbers:
                 
            if numberOne == numberTwo:
                count+=1
                
                
        if count > 1 and numberOne not in new_list:
            new_list.append(numberOne)
    return new_list



