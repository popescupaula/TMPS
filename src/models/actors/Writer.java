package models.actors;

import domain.builders.implementations.*;

public class Writer {
    public static final String RESET = "\033[0m";
    public static final String BLUE_BRIGHT = "\033[0;94m";
    public static final String CYAN = "\033[0;36m";

    public void sellFrench(FrenchBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Madame Bovary"+ RESET);
        builder.setAuthor(CYAN + "Gustave Flaubert"+ RESET);
        builder.setPage(367);
        builder.setPrice(124.87);
    }

    public void sellEnglish(EnglishBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Trimalchio: An Early Version of The Great Gatsby"+ RESET);
        builder.setAuthor(CYAN + "F. Scott Fitzgerald"+ RESET);
        builder.setPage(160);
        builder.setPrice(137.64);
    }

    public void sellRomanian(RomanianBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Mara"+ RESET);
        builder.setAuthor(CYAN + "Ioan Slavici"+ RESET);
        builder.setPage(280);
        builder.setPrice(90.09);
    }

    public void sellFantasy(FantasyBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Me before you"+ RESET);
        builder.setAuthor(CYAN + "Jojo Moyes"+ RESET);
        builder.setPage(528);
        builder.setPrice(255.2);
    }

    public void sellDrama(DramaBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Hamlet"+ RESET);
        builder.setAuthor(CYAN + "William Shakespeare"+ RESET);
        builder.setPage(192);
        builder.setPrice(80.99);
    }

    public void sellPoetry(PoetryBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Hype"+ RESET);
        builder.setAuthor(CYAN + "Hose Pablo"+ RESET);
        builder.setPage(88);
        builder.setPrice(100.1);
    }
}
