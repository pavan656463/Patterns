class Book:
    def __init__(self, title, author, genre):
        self.title = title
        self.author = author
        self.genre = genre

    def display(self):
        print(f"Title: {self.title}, Author: {self.author}, Genre: {self.genre}")


class BookCatalog:
    def __init__(self):
        self._books = {}

    def get_book(self, title, author, genre):
        key = (title, author, genre)
        if key not in self._books:
            self._books[key] = Book(title, author, genre)
        return self._books[key]


class BookDistributor:
    def __init__(self):
        self._book_catalog = BookCatalog()

    def distribute_books(self, book_orders):
        for order in book_orders:
            book = self._book_catalog.get_book(order["title"], order["author"], order["genre"])
            print("Distributing book:")
            book.display()
            print()


def main():
    distributor = BookDistributor()

    orders = [
        {"title": "The Great Gatsby", "author": "F. Scott Fitzgerald", "genre": "Fiction"},
        {"title": "To Kill a Mockingbird", "author": "Harper Lee", "genre": "Fiction"},
        {"title": "1984", "author": "George Orwell", "genre": "Dystopian Fiction"},
        {"title": "The Catcher in the Rye", "author": "J.D. Salinger", "genre": "Fiction"},
        {"title": "Pride and Prejudice", "author": "Jane Austen", "genre": "Romance"},
        {"title": "The Hobbit", "author": "J.R.R. Tolkien", "genre": "Fantasy"}
    ]

    distributor.distribute_books(orders)


if __name__ == "__main__":
    main()
