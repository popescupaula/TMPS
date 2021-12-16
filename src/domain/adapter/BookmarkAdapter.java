package domain.adapter;

import models.books.abstractions.IBook;
import models.bookmarks.abstractions.IBookmark;

public class BookmarkAdapter implements IBook{
    private final IBookmark corner;

    public BookmarkAdapter(IBookmark bookmark){
        this.corner = bookmark;
    }

    public String toString(){ return corner.toString();}

    @Override
    public String getCuriosity() {return null;    }

    @Override
    public void setName(String name) {  }

    @Override
    public void setAuthor(String author) {}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public void setPage(int page) {}

    @Override
    public int getPage() {
        return 0;
    }

    @Override
    public void setPrice(double price) { }

    @Override
    public double getPrice() {
        return 0;
    }
}
