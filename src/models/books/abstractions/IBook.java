package models.books.abstractions;

public interface IBook {
    String getCuriosity();
    void setName(String name);
    void setAuthor(String author);
    String getName();
    String getAuthor();
    void setPage(int sugar);
    int getPage();
    void setPrice(double price);
    double getPrice();
}