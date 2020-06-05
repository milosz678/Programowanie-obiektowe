package pl.indykiewicz.secondapp;

public class Movie extends Item {

    int resolution; // 720, 1080 itp.

    public Movie(int id, int releaseDate, int price, String author, String publisher, int timeLended, int resolution) {
        super(id, releaseDate, price, author, publisher, timeLended);
        this.resolution = resolution;
    }
}
