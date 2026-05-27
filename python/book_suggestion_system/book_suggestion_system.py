import random

books = ["The Mystery", "Student Life", 
        "Poor Dad, Rich dad", "Growth Mindset",
        "The Hobbit", "Animal Farm", "Brave kingdom" ]


def get_suggestion():
    random_number = random.randint(1,101)
    random_book = random.choice(books)
    
    return f"Book Title: {random_book}\nPage: {random_number}"
    
def add_book(book):

    if book in books:
    
        return "Book already exists."
    else:
        books.append(book)   
    
    return "Book added successfully."


def remove_book(book_name):

    if book_name in books:
    
        books.remove(book_name)
        
        return "Book removed succefully!."
    else:
        return "Book does not exist."


def update_book(old_book, new_book):

    if old_book in books:

        index = books.index(old_book)

        books[index] = new_book
        
        return "Book updated succefully!"
    else:
        return "Book does not exist."



def show_book():
    
    all_books = ""
    
    count = 1
        
    for book in books:

        all_books += f"{count}. {book}\n"
        
        count += 1
        
    return all_books

