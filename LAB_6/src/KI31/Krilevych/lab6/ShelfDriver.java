package KI31.Krilevych.lab6;

/**
 * Клас-драйвер для демонстрації роботи класу Shelf.
 * Цей клас містить метод main, який демонструє функціональність класу Shelf для зберігання книг і DVD.
 * @version 1.0
 */
public class ShelfDriver {
    public static void main(String[] args) {
        // Створюємо поличку для книг
        Shelf<Book> bookShelf = new Shelf<>(5, "Living Room");

        // Додаємо книги
        bookShelf.addItem(new Book("The Hobbit", "J.R.R. Tolkien", 310));
        bookShelf.addItem(new Book("1984", "George Orwell", 328));
        bookShelf.addItem(new Book("Java Programming", "John Doe", 450));

        // Знаходимо книгу з найменшою кількістю сторінок
        Book minBook = bookShelf.findMinElement(Book::compareTo);
        System.out.println("Книга з найменшою кількістю сторінок: " + minBook);

        // Створюємо поличку для DVD
        Shelf<DVD> dvdShelf = new Shelf<>(10, "TV Stand");

        // Додаємо DVD
        dvdShelf.addItem(new DVD("The Matrix", 136, 1999));
        dvdShelf.addItem(new DVD("Inception", 148, 2010));
        dvdShelf.addItem(new DVD("Avatar", 162, 2009));

        // Знаходимо DVD з найменшою тривалістю
        DVD minDVD = dvdShelf.findMinElement(DVD::compareTo);
        System.out.println("DVD з найменшою тривалістю: " + minDVD);

        // Демонструємо інші методи
        System.out.println("Кількість книг на поличці: " + bookShelf.getItemCount());
        System.out.println("Кількість DVD на поличці: " + dvdShelf.getItemCount());

        // Перевіряємо наявність елементів
        Book searchBook = new Book("1984", "George Orwell", 328);
        System.out.println("Книга '1984' присутня: " + bookShelf.containsItem(searchBook));

        // Видаляємо елемент
        dvdShelf.removeItem(minDVD);
        System.out.println("Кількість DVD після видалення: " + dvdShelf.getItemCount());
    }
}

