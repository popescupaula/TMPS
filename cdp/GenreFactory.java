package cdp;

import cdp.books.Book;
import cdp.books.builders.DramaBuilder;
import cdp.books.builders.FantasyBuilder;
import cdp.books.builders.PoetryBuilder;

public class GenreFactory implements AbstractFactory {
    private static GenreFactory genreFactory;
    private final Writer writer = new Writer();

    public static GenreFactory getGenreFactory(){
        if (genreFactory == null)
            genreFactory = new GenreFactory();
        return genreFactory;
    }

    private GenreFactory(){}

    public Book sellBook(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "fantasy") {
            FantasyBuilder fantasyBuilder = new FantasyBuilder();
            writer.sellFantasy(fantasyBuilder);
            return fantasyBuilder.getBook();

        } else if (name.toLowerCase() == "drama") {
            DramaBuilder dramaBuilder = new DramaBuilder();
            writer.sellDrama(dramaBuilder);
            return dramaBuilder.getBook();

        } else if (name.toLowerCase() == "poetry") {
            PoetryBuilder poetryBuilder = new PoetryBuilder();
            writer.sellPoetry(poetryBuilder);
            return poetryBuilder.getBook();
        }
        return null;
    }
}
