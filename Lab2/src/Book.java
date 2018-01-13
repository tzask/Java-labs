
class Book extends PrintedMatter {
    private int ISBN;
    public void setISBN(int ISBNcode) {
        ISBN = ISBNcode;
    }
    public int getISBN() {
        return ISBN;
    }
    Book() {
        super();
        ISBN = 0;
    }
    Book(int ISBNcode) {
        super();
        ISBN = ISBNcode;
    }
    Book(int year, int ISBNcode) {
        super(year);
        ISBN = ISBNcode;
    }
}
