package models.bookmarks.implementations;

import models.bookmarks.abstractions.IBookmark;

public class Tag implements IBookmark {
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String CYAN = "\033[0;36m";
    public static final String RESET = "\033[0m";
    private String name;
    private float price;

    public Tag(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name + "Tea";
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bookmark: " + CYAN + name + " Tag" + RESET + "\nPrice: " + PURPLE_BRIGHT + price + " MDL\n" + RESET;
    }
}
