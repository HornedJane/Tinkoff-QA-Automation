package ru.fintech.qa.bookReader;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books) {

        final Random random = new Random();
        int num = random.nextInt(books.length);

        return books[num];
    }

    public void readBook(Book book) {

        System.out.println(book.toString());
    }

    public void rateBook(Book book) {

        String rate;
        int rating;
        int nullCount = 0;
        final Random random = new Random();

        rating = book.title.replaceAll(" ", "").length();

        if (book.author != null) {
            rating += book.author.replaceAll(" ", "").length();
        } else nullCount++;

        if (book.numberInSeries != null) {
            rating -= book.numberInSeries;
        } else nullCount++;

        if (book.numberOfPages != null) {
            rating += book.numberOfPages;
        } else nullCount++;

        for (int i = 0; i < nullCount; i++) {
            rating -= random.nextInt(Math.abs(rating));
        }

        rate = book.title + "\nRated: " + rating;
        System.out.println(rate);
    }
}
