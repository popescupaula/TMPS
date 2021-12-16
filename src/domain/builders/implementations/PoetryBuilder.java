package domain.builders.implementations;

import domain.builders.abstractions.IBookBuilder;
import models.books.implementations.Poetry;

public class PoetryBuilder implements IBookBuilder {
    private Poetry poetry;

    public PoetryBuilder(){
        this.create();
    }

    public void create(){
        this.poetry = new Poetry();
    }

    @Override
    public void setName(String name) {
        this.poetry.setName(name);
    }

    @Override
    public void setAuthor(String author) {
        this.poetry.setAuthor(author);
    }

    public void setPage(int page){
        this.poetry.setPage(page);
    }

    @Override
    public void setPrice(double price) {
        this.poetry.setPrice(price);
    }

    public Poetry getBook(){
        Poetry book = this.poetry;
        this.create();
        return book;
    }
}