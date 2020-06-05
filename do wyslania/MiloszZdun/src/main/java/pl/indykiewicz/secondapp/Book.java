package pl.indykiewicz.secondapp;

public class Book extends Item {

    int pageCount;

    public Book(int id, int releaseDate, int price, String author, String publisher, int timeLended, int pageCount) {
        super(id, releaseDate, price, author, publisher, timeLended);
        this.pageCount = pageCount;
    }
}
