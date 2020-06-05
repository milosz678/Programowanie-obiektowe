package pl.indykiewicz.secondapp;

public class Ebook extends Item{

    boolean isBeginnerFriendly;

    public Ebook(int id, int releaseDate, int price, String author, String publisher,
                 int timeLended, boolean isBeginnerFriendly) {
        super(id, releaseDate, price, author, publisher, timeLended);
        this.isBeginnerFriendly = isBeginnerFriendly;
    }
}
