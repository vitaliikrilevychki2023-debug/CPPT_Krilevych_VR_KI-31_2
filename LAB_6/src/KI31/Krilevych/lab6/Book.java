package KI31.Krilevych.lab6;

/**
 * Клас, що представляє книгу
 */
class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int pages;

    /**
     * Конструктор класу Book
     * @param title назва книги
     * @param author автор книги
     * @param pages кількість сторінок
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', pages=" + pages + "}";
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);
    }
}

