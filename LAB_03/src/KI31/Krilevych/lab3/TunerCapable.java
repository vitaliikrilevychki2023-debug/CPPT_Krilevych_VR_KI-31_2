package KI31.Krilevych.lab3;

import java.io.IOException;

/**
 * Інтерфейс для телевізорів з тюнером, що дозволяє сканувати канали
 * та керувати улюбленими каналами.
 */
public interface TunerCapable {

    /**
     * Сканує доступні телевізійні канали.
     *
     * @throws IOException якщо виникає помилка під час сканування.
     * @throws InterruptedException якщо процес сканування перервано.
     */
    void scanChannels() throws IOException, InterruptedException;

    /**
     * Додає канал до списку улюблених.
     *
     * @param channel Номер каналу, який необхідно додати.
     * @throws IOException якщо виникає помилка під час додавання каналу.
     */
    void addFavoriteChannel(int channel) throws IOException;

    /**
     * Видаляє канал зі списку улюблених.
     *
     * @param channel Номер каналу, який необхідно видалити.
     * @throws IOException якщо виникає помилка під час видалення каналу.
     */
    void removeFavoriteChannel(int channel) throws IOException;
}

