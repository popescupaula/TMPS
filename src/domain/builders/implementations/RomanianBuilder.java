package domain.builders.implementations;

import domain.builders.abstractions.IBookBuilder;
import models.books.implementations.Romanian;

public class RomanianBuilder implements IBookBuilder {
    private Romanian romanian;

    public RomanianBuilder(){
        this.create();
    }

    public void create(){
        this.romanian = new Romanian();
    }

    @Override
    public void setName(String name) {
        this.romanian.setName(name);
    }

    @Override
    public void setAuthor(String author) {
        this.romanian.setAuthor(author);
    }

    public void setPage(int page){
        this.romanian.setPage(page);
    }

    @Override
    public void setPrice(double price) {
        this.romanian.setPrice(price);
    }

    public Romanian getBook(){
        Romanian book = this.romanian;
        this.create();
        return book;
    }
}
