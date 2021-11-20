package domain.decorator;

import models.books.abstractions.IBook;

public class CustomPackaging extends BookDecorator{
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\033[0;31m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String RESET = "\033[0m";

    public CustomPackaging(IBook book){
        super(book);
    }

    public String getCuriosity(){
        return super.getCuriosity();
    }
    private String setCustomPackaging(){
        return (YELLOW + "\nYou have chosen a custom packaging for your book" + RESET);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setAuthor(String author){
        super.setAuthor(author);
    }

    public void setPage(int page) {
        super.setPage(page);
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }
    public String getName(){
        return super.getName();
    }

    @Override
    public String getAuthor(){
        return super.getAuthor();
    }

    @Override
    public int getPage(){
        return super.getPage();
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 10;
    }

    @Override
    public String toString() {
        return "\nThe '" + getName() + "' write by " + getAuthor() + "\n" + getCuriosity()  + setCustomPackaging() + "\nNumber of pages: " + RED + getPage() + "p" + RESET + "\nPrice: "+ PURPLE_BRIGHT + getPrice() + " MDL\n" + RESET ;
    }

}
