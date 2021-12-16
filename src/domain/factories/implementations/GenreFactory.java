package domain.factories.implementations;

import domain.decorator.CustomPackaging;
import domain.factories.abstractions.IAbstractFactory;
import models.actors.Writer;
import models.books.abstractions.IBook;
import domain.builders.implementations.FantasyBuilder;
import domain.builders.implementations.DramaBuilder;
import domain.builders.implementations.PoetryBuilder;


public class GenreFactory implements IAbstractFactory {
    private static GenreFactory genreFactory;
    private final Writer writer = new Writer();

    public static GenreFactory getGenreFactory(){
        if (genreFactory == null)
            genreFactory = new GenreFactory();
        return genreFactory;
    }

    private GenreFactory(){}

    public IBook sellBook(String name, boolean needsCustomPackage) {
        IBook book = null;
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
        if (needsCustomPackage == true){
            book = new CustomPackaging(book);
        }
        return book;
    }
}