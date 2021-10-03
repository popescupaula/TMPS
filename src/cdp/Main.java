package cdp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        label:
        while(true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nWe're glad you came to our bookstore!\nFrom which category would you like to buy books: genre or language? " +
                    "\nIf you want to exit press X ");
            String type = input.readLine();
            if (type.length() == 0)
                break;

            if (type.equals("language")){
                AbstractFactory languageFactory = LanguageFactory.getLanguageFactory();
                System.out.println(languageFactory.sellBook("french").toString());
                System.out.println(languageFactory.sellBook("english").toString());
                System.out.println(languageFactory.sellBook("romanian").toString());
                break ;
            } else if (type.equals("genre")){
                AbstractFactory genreFactory = GenreFactory.getGenreFactory();
                System.out.println(genreFactory.sellBook("fantasy").toString());
                System.out.println(genreFactory.sellBook("drama").toString());
                System.out.println(genreFactory.sellBook("poetry").toString());
                break;
            } else if (type.equals("X"))
                break label;
            else{
                System.out.println("Oh no, we don't have this type of books in our store!");
                break;
            }
        }
    }
}
