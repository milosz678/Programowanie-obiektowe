package pl.indykiewicz.secondapp;

public class Audiobook extends Item {

    String readingActor;

    public Audiobook(int id, int releaseDate, int price, String author, String publisher,
                     String readingActor, int timeLended) {
        super(id, releaseDate, price, author, publisher, timeLended);
        this.readingActor = readingActor;
    }
}
