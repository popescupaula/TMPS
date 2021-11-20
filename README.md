# Creational Design Patterns

Author: Popescu Paula   
Academic Group: FAF-191

## Table of Contents:
1. [Laboratory 1:](#laboratory1)
2. [Laboratory 2:](#laboratory2)

#  Laboratory 1:
## Table of Contents:
1. [Objectives:](#objectives) 
2. [Task:](#task)
3. [Theory:](#theory)
4. [Implementation:](#implementation)
5. [Results:](#results)

## Objectives:
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.

## Task:
1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).
2. Select a domain area for the sample project.
3. Define the main involved classes and think about what instantiation mechanisms are needed.
4. Based on the previous point, implement atleast 3 creational design patterns in your project.

## Theory:
In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.

Some examples of this kind of design patterns are:
* Singleton
* Builder
* Prototype
* Object Pooling
* Factory Method
* Abstract Factory

## Implementation:
In this laboratory work, I simulate a bookstore, where the products are devided into two categories : by genres and by language. Therefore, each category has a factory method implemented GenreFactory and LanguageFactory, which are used to generate objects of concrete classes. The Genre Factory and Language Factory implement the interface Abstract Factory which has the method sellBook(). 
* Abstract Factory
```
public interface AbstractFactory {
    Book sellBook(String name);
}
```
Each factory has three subclasses with their separate implemented builders. This was done in order to enable the user to create different representations from the same construction process. In each two concrete factories, there is a static creation method that acts like a constructor. This method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.   
* Genre Factory
```
public class GenreFactory implements AbstractFactory {
    private static GenreFactory genreFactory;
    private final Writer writer = new Writer();

    public static GenreFactory getGenreFactory(){
        if (genreFactory == null)
            genreFactory = new GenreFactory();
        return genreFactory;
    }

    private GenreFactory(){}

    public Book sellBook(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "fantasy") {
            FantasyBuilder fantasyBuilder = new FantasyBuilder();
            writer.sellFantasy(fantasyBuilder);
            return fantasyBuilder.getBook();

        } else if (name.toLowerCase() == "drama") {
            DramaBuilder dramaBuilder = new DramaBuilder();
            writer.sellDrama(dramaBuilder);
            return dramaBuilder.getBook();

        } else if (name.toLowerCase() == "poetry") {
            PoetryBuilder poetryBuilder = new PoetryBuilder();
            writer.sellPoetry(poetryBuilder);
            return poetryBuilder.getBook();
        }
        return null;
    }
}
```

* Language Factory
```
public class LanguageFactory implements AbstractFactory {
    private static LanguageFactory languageFactory;
    private final Writer writer = new Writer();

    public static LanguageFactory getLanguageFactory(){
        if (languageFactory == null)
            languageFactory = new LanguageFactory();
        return languageFactory;
    }

    private LanguageFactory(){}

    public Book sellBook(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "french") {
            FrenchBuilder frenchBuilder = new FrenchBuilder();
            writer.sellFrench(frenchBuilder);
            return frenchBuilder.getBook();
        } else if (name.toLowerCase() == "english") {
            EnglishBuilder englishBuilder = new EnglishBuilder();
            writer.sellEnglish(englishBuilder);
            return englishBuilder.getBook();
        } else if (name.toLowerCase() == "romanian") {
            RomanianBuilder romanianBuilder = new RomanianBuilder();
            writer.sellRomanian(romanianBuilder);
            return romanianBuilder.getBook();
        }
        return null;
    }
}
```
* Singleton
```
public class GenreFactory implements AbstractFactory {
    private static GenreFactory genreFactory;
    private final Writer writer = new Writer();

    public static GenreFactory getGenreFactory(){
        if (genreFactory == null)
            genreFactory = new GenreFactory();
        return genreFactory;
    }

    private GenreFactory(){}
```

* Builder
```
public interface BookBuilder {
    void create();
    void setName(String name);
    void setAuthor(String author);
    void setPage(int page);
    void setPrice(double price);
}
```

## Results
Here is ilustrated the results for differet type of inputs:
* genres
```
We're glad you came to our bookstore!
From which category would you like to buy books: genre or language? 
If you want to exit press X 
genre

The 'Me before you' write by Jojo Moyes
The first book ever written using a typewriter was The Adventures of Tom Sawyer.
Number of pages: 528p
Price: 255.2 MDL

The 'Hamlet' write by William Shakespeare
There are over 129 million books in existence.
Number of pages: 192p
Price: 80.99 MDL

The 'Hype' write by Hose Pablo
Icelandic people read more than anyone.
Number of pages: 88p
Price: 100.1 MDL

```

* language
```
We're glad you came to our bookstore!
From which category would you like to buy books: genre or language? 
If you want to exit press X 
language

The 'Madame Bovary' write by Gustave Flaubert
President Theodore Roosevelt read one book per day.
Number of pages: 367p
Price: 124.87 MDL

The 'Trimalchio: An Early Version of The Great Gatsby' write by F. Scott Fitzgerald
The most expensive book ever purchased was sold for $30.8 million.
Number of pages: 160p
Price: 137.64 MDL

The 'Mara' write by Ioan Slavici
The three most read books in the world are: The Holy Bible, Quotations from Chairman Mao Tse-Tung, and Harry Potter.
Number of pages: 280p
Price: 90.09 MDL
```

* Wrong Input
```
We're glad you came to our bookstore!
From which category would you like to buy books: genre or language? 
If you want to exit press X 
book
Oh no, we don't have this type of books in our store!
```

#  Laboratory 2:
