package cdp.books.builders;

public interface BookBuilder {
    void create();
    void setName(String name);
    void setAuthor(String author);
    void setPage(int page);
    void setPrice(double price);
}

