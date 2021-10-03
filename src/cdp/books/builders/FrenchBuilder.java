package cdp.books.builders;

import cdp.books.French;

public class FrenchBuilder implements BookBuilder {

    private French french;

    public FrenchBuilder(){
        this.create();
    }

    public void create(){
        this.french = new French();
    }

    @Override
    public void setName(String name) {
        this.french.setName(name);
    }

    @Override
    public void setAuthor(String author) {
        this.french.setAuthor(author);
    }

    public void setPage(int page){
        this.french.setPage(page);
    }

    @Override
    public void setPrice(double price) {
        this.french.setPrice(price);
    }

    public French getBook(){
        French book = this.french;
        this.create();
        return book;
    }
}
