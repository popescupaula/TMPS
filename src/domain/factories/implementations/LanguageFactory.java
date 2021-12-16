package domain.factories.implementations;

import domain.decorator.CustomPackaging;
import domain.factories.abstractions.IAbstractFactory;
import models.actors.Writer;
import models.books.abstractions.IBook;
import domain.builders.implementations.FrenchBuilder;
import domain.builders.implementations.RomanianBuilder;
import domain.builders.implementations.EnglishBuilder;

public class LanguageFactory implements IAbstractFactory {
    private static LanguageFactory languageFactory;
    private final Writer writer = new Writer();

    public static LanguageFactory getLanguageFactory(){
        if (languageFactory == null)
            languageFactory = new LanguageFactory();
        return languageFactory;
    }

    private LanguageFactory(){}

    public IBook sellBook(String name, boolean needsCustomPackage) {
        IBook book = null;
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "french") {
            FrenchBuilder frenchBuilder = new FrenchBuilder();
            writer.sellFrench(frenchBuilder);
            return frenchBuilder.getBook();
        } else if (name.toLowerCase() == "english") {
            EnglishBuilder englishBuilder = new EnglishBuilder();
            writer.sellEnglish(englishBuilder);
            return englishBuilder.getBook();
        } else if (name.toLowerCase() == "romanian") {
            RomanianBuilder romanianBuilder = new RomanianBuilder();
            writer.sellRomanian(romanianBuilder);
            return romanianBuilder.getBook();
        }
        if (needsCustomPackage == true){
            book = new CustomPackaging(book);
        }
        return book;
    }
}