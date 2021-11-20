package client;

import domain.adapter.BookmarkAdapter;
import domain.composite.CompositePattern;
import domain.factories.abstractions.IAbstractFactory;
import domain.factories.implementations.GenreFactory;
import domain.factories.implementations.LanguageFactory;
import models.bookmarks.abstractions.IBookmark;
import models.bookmarks.implementations.Corner;
import models.bookmarks.implementations.Tag;
import models.books.abstractions.IBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String CYAN = "\033[0;36m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) throws IOException{

        label:
        while(true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n---Welcome to our Library!---\nWhat type of book would you like to buy?\n*language \n*genre  \n*bookmark \nIf you want to exit press X ");
            String type = input.readLine();
            if (type.length() == 0)
                break;

            if (type.equals("language")) {
                System.out.println("Do you want custom packaging? y/n");
                String type2 = input.readLine();
                if(type2.equals("n"))
                {
//                    needsCustomPackage = false;
                    IAbstractFactory languageFactory = LanguageFactory.getLanguageFactory();
                    System.out.println(languageFactory.sellBook("french", false).toString());
                    System.out.println(languageFactory.sellBook("english", false).toString());
                    System.out.println(languageFactory.sellBook("romanian", false).toString());
                }
                else{
//                    needsCustomPackage = true;
                    IAbstractFactory languageFactory = LanguageFactory.getLanguageFactory();
                    System.out.println(languageFactory.sellBook("french", true).toString());
                    System.out.println(languageFactory.sellBook("english", true).toString());
                    System.out.println(languageFactory.sellBook("romanian", true).toString());
                }
                break;
            } else if (type.equals("genre")) {
                System.out.println("Do you want custom packaging? y/n");
                String type2 = input.readLine();
                if(type2.equals("n")) {
                    IAbstractFactory genreFactory = GenreFactory.getGenreFactory();
                    System.out.println(genreFactory.sellBook("fantasy", false).toString());
                    System.out.println(genreFactory.sellBook("drama", false).toString());
                    System.out.println(genreFactory.sellBook("poetry", false).toString());
                }else{
                    IAbstractFactory genreFactory = GenreFactory.getGenreFactory();
                    System.out.println(genreFactory.sellBook("fantasy", true).toString());
                    System.out.println(genreFactory.sellBook("drama", true).toString());
                    System.out.println(genreFactory.sellBook("poetry", true).toString());
                }
                break;
            } else if (type.equals("bookmark")){
                IBookmark coloredCorner = new Corner("Colored", 15);
                IBookmark whiteCorner = new Corner("White", 10);

                IBookmark woodTag = new Tag("Wood", 25);
                IBookmark paperTag = new Tag("Paper", 15);

                CompositePattern corners = new CompositePattern("Corners");

                CompositePattern tags = new CompositePattern("Tags");
                corners.addBookmark(coloredCorner);
                corners.addBookmark(whiteCorner);
                tags.addBookmark(woodTag);
                tags.addBookmark(paperTag);

                System.out.println(CYAN + '*' + corners.getName() + "\n" + RESET);
                IBook adaptedColoredCorner = new BookmarkAdapter(coloredCorner);
                IBook adaptedWhiteCorner = new BookmarkAdapter(whiteCorner);

                System.out.println(adaptedColoredCorner.toString());
                System.out.println(adaptedWhiteCorner.toString());


                System.out.println(CYAN + '*' + tags.getName() + "\n" + RESET);
                IBook adaptedWoodTag = new BookmarkAdapter(woodTag);
                IBook adaptedPaperTag = new BookmarkAdapter(paperTag);
                System.out.println(adaptedWoodTag.toString());
                System.out.println(adaptedPaperTag.toString());

                break;
            }
            else if (type.equals("X"))
                break label;
            else{
                System.out.println("Oh no, we don't have this type of book!");
                break;
            }
        }
    }
}
