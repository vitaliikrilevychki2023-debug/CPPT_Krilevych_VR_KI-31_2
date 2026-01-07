package KI31.Krilevych.lab3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас TunerTelevision розширює Television та реалізує інтерфейс TunerCapable,
 * що дозволяє сканувати канали та керувати улюбленими каналами.
 */
public class TunerTelevision extends Television implements TunerCapable {
    private List<Integer> favoriteChannels;

    /**
     * Конструктор для створення телевізора з тюнером.
     *
     * @param screen Екран телевізора
     * @param speaker Динамік телевізора
     * @param remoteControl Пульт керування
     * @throws IOException якщо виникає помилка при ініціалізації логера
     */
    public TunerTelevision(Screen screen, Speaker speaker, RemoteControl remoteControl) throws IOException {
        super(screen, speaker, remoteControl);
        this.favoriteChannels = new ArrayList<>();
    }

    /**
     * Вмикає телевізор з тюнером.
     *
     * @throws IOException якщо виникає помилка під час увімкнення
     */
    @Override
    public void turnOn() throws IOException {
        isOn = true;
        logger.log("Телевізор з тюнером увімкнено");
        System.out.println("Телевізор з тюнером увімкнено");
    }

    /**
     * Вимикає телевізор з тюнером.
     *
     * @throws IOException якщо виникає помилка під час вимкнення
     */
    @Override
    public void turnOff() throws IOException {
        isOn = false;
        logger.log("Телевізор з тюнером вимкнено");
        System.out.println("Телевізор з тюнером вимкнено");
    }

    /**
     * Сканує доступні телевізійні канали.
     *
     * @throws IOException якщо виникає помилка під час сканування
     * @throws InterruptedException якщо процес сканування перервано
     */
    @Override
    public void scanChannels() throws IOException, InterruptedException {
        if (isOn) {
            logger.log("Сканування каналів...");
            System.out.println("Сканування каналів...");
            // Імітація сканування каналів
            Thread.sleep(2000);
            logger.log("Сканування завершено. Знайдено 50 каналів.");
            System.out.println("Сканування завершено. Знайдено 50 каналів.");
        }
    }

    /**
     * Додає канал до списку улюблених.
     *
     * @param channel Номер каналу, який необхідно додати
     * @throws IOException якщо виникає помилка під час додавання каналу
     */
    @Override
    public void addFavoriteChannel(int channel) throws IOException {
        if (!favoriteChannels.contains(channel)) {
            favoriteChannels.add(channel);
            logger.log("Канал " + channel + " додано до улюблених");
            System.out.println("Канал " + channel + " додано до улюблених");
        }
    }

    /**
     * Видаляє канал зі списку улюблених.
     *
     * @param channel Номер каналу, який необхідно видалити
     * @throws IOException якщо виникає помилка під час видалення каналу
     */
    @Override
    public void removeFavoriteChannel(int channel) throws IOException {
        if (favoriteChannels.remove(Integer.valueOf(channel))) {
            logger.log("Канал " + channel + " видалено з улюблених");
            System.out.println("Канал " + channel + " видалено з улюблених");
        }
    }
}

