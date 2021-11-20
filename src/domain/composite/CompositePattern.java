package domain.composite;

import models.bookmarks.abstractions.IBookmark;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern implements IBookmark {
    private String name;

    private List<IBookmark> childBookmarks;

    public CompositePattern(String name){
        this.name = name;
        this.childBookmarks = new ArrayList<>();
    }

    public void addBookmark(IBookmark bookmark){
        childBookmarks.add(bookmark);
    }

    public void removeBookmark(IBookmark bookmark){
        childBookmarks.remove(bookmark);
    }

    @Override
    public void setName(String name){
        for (IBookmark childBookmark : childBookmarks) {
            childBookmark.setName(name);
        }
    }
    @Override
    public void setPrice(float price) {
        for (IBookmark childBookmark : childBookmarks) {
            childBookmark.setPrice(price);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
