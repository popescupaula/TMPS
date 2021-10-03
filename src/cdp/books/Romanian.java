package cdp.books;

public class Romanian implements Book {
    private String name;
    private String author;
    private int page;
    private double price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAuthor(String origin) {
        this.author = origin;
    }

    @Override
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCuriosity(){
        return "The three most read books in the world are: The Holy Bible, Quotations from Chairman Mao Tse-Tung, and Harry Potter.";
    }

    public String toString(){
        return "\nThe '" + name + "' write by " + author + "\n" + getCuriosity() + "\n" + "Number of pages: " + page + "p" + "\nPrice: " + price + " MDL";
    }
}
