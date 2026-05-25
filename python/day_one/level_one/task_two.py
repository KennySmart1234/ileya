

def check_palindrome(numbers):

    reversed_list = []   
    
    for number in numbers[::-1]:
        reversed_list.append(number) 
    
    count = 0   
    for index in range(len(reversed_list)):                
        if(numbers[index] == reversed_list[index]):
            count = count + 1
    
    if(count == len(numbers)):
        return True
    else:
        return False    




