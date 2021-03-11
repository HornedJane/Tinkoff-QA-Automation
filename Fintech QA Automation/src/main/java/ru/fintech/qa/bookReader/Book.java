package ru.fintech.qa.bookReader;

public class Book {

    String title;
    String author;
    Integer numberInSeries;
    Integer numberOfPages;

    Book(String title,
         String author,
         Integer numberInSeries,
         Integer numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberInSeries = numberInSeries;
        this.numberOfPages = numberOfPages;
    }

    Book(String title,
         String author,
         Integer numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    Book(String title,
         String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {

        String description = title + "\n";

        if (author != null) {
            description += "written by: " + author + "\n";
        }
        if (numberInSeries != null) {
            description += "num." + numberInSeries + " in series\n";
        }
        if (numberOfPages != null) {
            description += "pages: " + numberOfPages + "\n";
        }

        return description;
    }
}

