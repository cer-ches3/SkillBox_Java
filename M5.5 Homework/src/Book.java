public class Book {
    private final String name;
    private final String author;
    private final int pageCount;
    private final String numISBN;

    public Book(String name, String author, int pageCount, String numISBN) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.numISBN = numISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getNumISBN() {
        return numISBN;
    }
}
