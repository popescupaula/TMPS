package models.books.implementations;

import models.books.abstractions.IBook;

public class French implements IBook {
    public static final String RED = "\033[0;31m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String RESET = "\033[0m";

    private String name;
    private String author;
    private int page;
    private double price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAuthor(String origin) {
        this.author = origin;
    }

    @Override
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAuthor(){
        return author;
    }

    public int getPage(){
        return page;
    }

    public double getPrice(){
        return price;
    }

    public String getCuriosity(){
        return "\033[3m President Theodore Roosevelt read one book per day. \033[3m";
    }

    public String toString(){
        return "\nThe '" + name + "' write by " + author + "\n" + getCuriosity() + "\n" + "Number of pages: " + page + "p" + "\nPrice: " + price + " MDL";
    }
}
