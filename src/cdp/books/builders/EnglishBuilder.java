package cdp.books.builders;

import cdp.books.English;

public class EnglishBuilder implements BookBuilder {

    private English english;

    public EnglishBuilder(){
        this.create();
    }

    public void create(){
        this.english = new English();
    }

    @Override
    public void setName(String name) {
        this.english.setName(name);
    }

    @Override
    public void setAuthor(String author) {
        this.english.setAuthor(author);
    }

    public void setPage(int page){
        this.english.setPage(page);
    }

    @Override
    public void setPrice(double price) {

        this.english.setPrice(price);
    }

    public English getBook(){
        English book = this.english;
        this.create();
        return book;
    }
}
