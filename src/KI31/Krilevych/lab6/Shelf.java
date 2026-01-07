package KI31.Krilevych.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Параметризований клас, що реалізує поличку для зберігання предметів
 * @param <T> тип предметів, що зберігаються на поличці
 */
public class Shelf<T> {
    private List<T> items;
    private int capacity;
    private String location;

    /**
     * Конструктор класу Shelf
     * @param capacity максимальна місткість полички
     * @param location розташування полички
     */
    public Shelf(int capacity, String location) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
        this.location = location;
    }

    /**
     * Додає предмет на поличку
     * @param item предмет для додавання
     * @return true якщо предмет додано успішно, false якщо поличка заповнена
     */
    public boolean addItem(T item) {
        if (items.size() < capacity) {
            return items.add(item);
        }
        return false;
    }

    /**
     * Видаляє предмет з полички
     * @param item предмет для видалення
     * @return true якщо предмет видалено успішно
     */
    public boolean removeItem(T item) {
        return items.remove(item);
    }

    /**
     * Знаходить мінімальний елемент на поличці за заданим компаратором
     * @param comparator компаратор для порівняння елементів
     * @return мінімальний елемент або null якщо поличка порожня
     */
    public T findMinElement(Comparator<T> comparator) {
        if (items.isEmpty()) {
            return null;
        }
        return Collections.min(items, comparator);
    }

    /**
     * Перевіряє чи є предмет на поличці
     * @param item предмет для пошуку
     * @return true якщо предмет знайдено
     */
    public boolean containsItem(T item) {
        return items.contains(item);
    }

    /**
     * Повертає кількість предметів на поличці
     * @return кількість предметів
     */
    public int getItemCount() {
        return items.size();
    }

    /**
     * Очищає поличку
     */
    public void clear() {
        items.clear();
    }

    /**
     * Повертає усі предмети з полички
     * @return список предметів
     */
    public List<T> getAllItems() {
        return new ArrayList<>(items);
    }
}

