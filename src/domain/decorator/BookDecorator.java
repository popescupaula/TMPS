package domain.decorator;

import models.books.abstractions.IBook;

public abstract class BookDecorator implements IBook{
    private IBook book;

    public BookDecorator(IBook book){
        this.book = book;
    }
    @Override
    public String getCuriosity(){
        return book.getCuriosity();
    }

    @Override
    public void setName(String name) {
        book.setName(name);
    }

    @Override
    public void setAuthor(String author){
        book.setAuthor(author);
    }

    @Override
    public void setPage(int page) {
        book.setPage(page);
    }

    @Override
    public void setPrice(double price) {
        book.setPrice(price);
    }

    @Override
    public String getName(){
        return book.getName();
    }

    @Override
    public String getAuthor(){
        return book.getAuthor();
    }

    @Override
    public int getPage(){
        return book.getPage();
    }

    @Override
    public double getPrice(){
        return book.getPrice();
    }

}