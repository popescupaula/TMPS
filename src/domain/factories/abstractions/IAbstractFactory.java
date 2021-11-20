package domain.factories.abstractions;

import models.books.abstractions.IBook;

public interface IAbstractFactory {
    IBook sellBook(String name, boolean needsCustomPackage);
}
