package pl.indykiewicz.secondapp;

public abstract class Item {
    int id, releaseDate, price, timeLended;
    String author, publisher;

    public Item(int id, int releaseDate, int price, String author, String publisher, int timeLended){
        this.author = author;
        this.releaseDate = releaseDate;
        this.id = id;
        this.price = price;
        this.publisher = publisher;
        this.timeLended = timeLended;
    }
}
