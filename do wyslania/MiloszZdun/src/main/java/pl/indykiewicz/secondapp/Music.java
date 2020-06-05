package pl.indykiewicz.secondapp;

public class Music extends Item {

    int bitRate; // in kb/s

    public Music(int id, int releaseDate, int price, String author, int timeLended, String publisher) {
        super(id, releaseDate, price, author, publisher, timeLended);
        this.bitRate = bitRate;
    }
}
