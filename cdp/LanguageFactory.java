package cdp;

import cdp.books.Book;
import cdp.books.builders.FrenchBuilder;
import cdp.books.builders.EnglishBuilder;
import cdp.books.builders.RomanianBuilder;

public class LanguageFactory implements AbstractFactory {
    private static LanguageFactory languageFactory;
    private final Writer writer = new Writer();

    public static LanguageFactory getLanguageFactory(){
        if (languageFactory == null)
            languageFactory = new LanguageFactory();
        return languageFactory;
    }

    private LanguageFactory(){}

    public Book sellBook(String name) {
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
        return null;
    }
}
