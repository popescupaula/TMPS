package cdp.books.builders;

import cdp.books.Fantasy;

public class FantasyBuilder implements BookBuilder {

    private Fantasy fantasy;

    public FantasyBuilder(){
        this.create();
    }

    public void create(){
        this.fantasy = new Fantasy();
    }

    @Override
    public void setName(String name) {
        this.fantasy.setName(name);
    }

    @Override
    public void setAuthor(String author) {
        this.fantasy.setAuthor(author);
    }

    public void setPage(int page){
        this.fantasy.setPage(page);
    }

    @Override
    public void setPrice(double price) {
        this.fantasy.setPrice(price);
    }

    public Fantasy getBook(){
        Fantasy book = this.fantasy;
        this.create();
        return book;
    }
}
