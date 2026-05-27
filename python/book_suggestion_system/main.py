import random

from book_suggestion_system import *
print()
message = """          Welcome to the Book Suggestion System!

1. Get Suggestions
2. Add Book
3. Remove Book
4. Update book
5. Show all books
6. Exit: 
Enter operation """


while True:

    user_input = input(message)
    match user_input:
        case "1":
            
            print()
            print(get_suggestion())   
            print()
            
            user_choice =  "yes"
            while(user_choice != "no"):
                user_choice = input(" Would you like to get another suggestion? (yes/no): ").lower()
                print()
                if(user_choice == "yes"):
                    print(get_suggestion())
                    print()


        case "2":
            print()
            book_title = input("Enter the book title: ")
            print(add_book(book_title))
            print()
            
            

        case "3":
            print()
            book_title = input("Enter the book title to remove: ")
            print(remove_book(book_title))
            print()
            
            

        case "4":
            print()
            old_title = input("Enter the old title: ")
            new_title = input("Enter the new title: ")
            print(update_book(old_title, new_title)) 
            print()
            
        case "5":
            print()            
            print(show_book())            
            print()
            
        case "6":
            print("good...bye")
            break


