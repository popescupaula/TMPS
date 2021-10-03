package cdp;

import cdp.books.builders.*;

public class Writer {
    public void sellFrench(FrenchBuilder builder) {
        builder.create();
        builder.setName("Madame Bovary");
        builder.setAuthor("Gustave Flaubert");
        builder.setPage(367);
        builder.setPrice(124.87);
    }

    public void sellEnglish(EnglishBuilder builder) {
        builder.create();
        builder.setName("Trimalchio: An Early Version of The Great Gatsby");
        builder.setAuthor("F. Scott Fitzgerald");
        builder.setPage(160);
        builder.setPrice(137.64);
    }

    public void sellRomanian(RomanianBuilder builder) {
        builder.create();
        builder.setName("Mara");
        builder.setAuthor("Ioan Slavici");
        builder.setPage(280);
        builder.setPrice(90.09);
    }

    public void sellFantasy(FantasyBuilder builder) {
        builder.create();
        builder.setName("Me before you");
        builder.setAuthor("Jojo Moyes");
        builder.setPage(528);
        builder.setPrice(255.2);
    }

    public void sellDrama(DramaBuilder builder) {
        builder.create();
        builder.setName("Hamlet");
        builder.setAuthor("William Shakespeare");
        builder.setPage(192);
        builder.setPrice(80.99);
    }

    public void sellPoetry(PoetryBuilder builder) {
        builder.create();
        builder.setName("Hype");
        builder.setAuthor("Hose Pablo");
        builder.setPage(88);
        builder.setPrice(100.1);
    }



}

