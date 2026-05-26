
def merging_two_arrays(numbers): 

    new_list = []
  
    for row in numbers:
        
        for number in row:
        
            new_list.append(number)
            
    for count_one in range(len(new_list)):

        for count_two in range(count_one + 1, len(new_list)):

            if (new_list[count_one] > new_list[count_two]):
            
                temporary = new_list[count_one]
                new_list[count_one] = new_list[count_two]
                new_list[count_two] = temporary
            
            
            
    return new_list
