package BookReader;

public class Main {

    public static void main(String[] args) {

        Book[] books;

        books = getBooks();     //should switch to JSON parser realization

        Reader reader = new Reader();
        Book selectedBook = reader.choiceBook(books);
        reader.readBook(selectedBook);
        reader.rateBook(selectedBook);

    }

    public static Book[] getBooks() {      //KLUDGE!

        Book[] books = new Book[10];

        books[0] = new Book("Coraline",
                "Neil Gaiman",
                192);

        books[1] = new Book("Taiko. An Epic Novel of War and Glory in Feudal Japan",
                "Eiji Yoshikawa",
                973);

        books[2] = new Book("Do Androids Dream of Electric Sheep?",
                "Philip K. Dick",
                210);

        books[3] = new Book("Harry Potter and the Methods of Rationality",
                "Eliezer Yudkowsky");

        books[4] = new Book("Surely You're Joking, Mr. Feynman!: Adventures of a Curious Character",
                "Ralph Leighton, Richard Feynman",
                350);

        books[5] = new Book("Introduction to Algorithms",
                "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein",
                1312);

        books[6] = new Book("The Music of Erich Zann",
                "H. P. Lovecraft",
                973);

        books[7] = new Book("Monday Begins on Saturday",
                "Boris and Arkady Strugatsky",
                1,
                222);

        books[8] = new Book("Tale of the Troika",
                "Boris and Arkady Strugatsky",
                2,
                286);

        books[9] = new Book("Neuromancer",
                "William Gibson",
                271);

        return books;
    }
}