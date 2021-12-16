package domain.builders.abstractions;

public interface IBookBuilder {
    void create();
    void setName(String name);
    void setAuthor(String author);
    void setPage(int page);
    void setPrice(double price);
}
