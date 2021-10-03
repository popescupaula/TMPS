package cdp;

import cdp.books.Book;

public interface AbstractFactory {
    Book sellBook(String name);
}
