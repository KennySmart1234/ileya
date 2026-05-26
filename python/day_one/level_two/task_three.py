

def swapping_of_zeros(numbers):

    new_list = []
    
    count = 0
    for number in numbers:
        if number != 0:
            new_list.append(number)
                
        elif number == 0:
            count +=1

    for zero in range(count):
        new_list.append(0)                
              
    return new_list

