

def check_most_appeared_value(numbers):

    new_list = []
    
    for number_one in numbers:

        count = 0
        
        for number_two in numbers:
                 
            if number_one == number_two:
                count+=1
                
                
        if count > 1 and number_one not in new_list:
            new_list.append(number_one)
    return new_list



