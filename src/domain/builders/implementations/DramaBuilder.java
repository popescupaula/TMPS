package domain.builders.implementations;

import domain.builders.abstractions.IBookBuilder;
import models.books.implementations.Drama;

public class DramaBuilder implements IBookBuilder {
    private Drama drama;

    public DramaBuilder(){
        this.create();
    }

    public void create(){
        this.drama = new Drama();
    }

    @Override
    public void setName(String name) {
        this.drama.setName(name);
    }

    @Override
    public void setAuthor(String author) {
        this.drama.setAuthor(author);
    }

    public void setPage(int page){
        this.drama.setPage(page);
    }

    @Override
    public void setPrice(double price) {
        this.drama.setPrice(price);
    }

    public Drama getBook(){
        Drama book = this.drama;
        this.create();
        return book;
    }
}
