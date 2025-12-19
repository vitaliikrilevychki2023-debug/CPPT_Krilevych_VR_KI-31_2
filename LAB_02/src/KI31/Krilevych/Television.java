package KI31.Krilevych;

import java.io.IOException;

/**
 * Клас `Television` представляє функціональність телевізора, який можна вмикати, вимикати,
 * змінювати канали, гучність, налаштовувати яскравість екрану, а також керувати через пульт.
 */
public class Television {
    private Screen screen;
    private Speaker speaker;
    private RemoteControl remoteControl;
    private Logger logger;
    private boolean isOn;
    private int currentChannel;
    private int volume;

    /**
     * Конструктор без параметрів, який ініціалізує телевізор зі стандартними налаштуваннями.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public Television() throws IOException {
        this.screen = new Screen(50);
        this.speaker = new Speaker(100);
        this.remoteControl = new RemoteControl();
        this.isOn = false;
        this.currentChannel = 0;
        this.volume = 0;

        this.logger = new Logger("television_log.txt");
        logger.log(String.format("Телевізор %s створений.", this.toString()));
    }

    /**
     * Конструктор, який приймає параметри для ініціалізації телевізора.
     *
     * @param screen Об'єкт екрану.
     * @param speaker Об'єкт динаміка.
     * @param remoteControl Пульт керування.
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public Television(Screen screen, Speaker speaker, RemoteControl remoteControl) throws IOException {
        this.screen = screen;
        this.speaker = speaker;
        this.remoteControl = remoteControl;
        this.isOn = false;
        this.currentChannel = 0;
        this.volume = 0;

        this.logger = new Logger("television_log.txt");
        logger.log(String.format("Телевізор %s створений.", this.toString()));
    }

    /**
     * Вмикає телевізор.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void turnOn() throws IOException {
        isOn = true;
        logger.log("Телевізор увімкнено");
        System.out.println("Телевізор увімкнено");
    }

    /**
     * Вимикає телевізор.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void turnOff() throws IOException {
        isOn = false;
        logger.log("Телевізор вимкнено");
        System.out.println("Телевізор вимкнено");
    }

    /**
     * Перемикає на наступний канал.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void changeChannelUp() throws IOException {
        if (isOn) {
            currentChannel++;
            logger.log(String.format("Перемкнуто на канал %s", currentChannel));
            System.out.printf("Перемкнуто на канал %s\n", currentChannel);
        }
    }

    /**
     * Перемикає на попередній канал.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void changeChannelDown() throws IOException {
        if (isOn && currentChannel >= 1) {
            currentChannel--;
            logger.log(String.format("Перемкнуто на канал %s", currentChannel));
            System.out.printf("Перемкнуто на канал %s\n", currentChannel);
        }
    }

    /**
     * Збільшує гучність телевізора.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void volumeUp() throws IOException {
        if (isOn && volume < 100) {
            volume++;
            speaker.setVolume(volume);
            logger.log(String.format("Гучність збільшено до %s", volume));
            System.out.printf("Гучність збільшено до %s\n", volume);
        }
    }

    /**
     * Зменшує гучність телевізора.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void volumeDown() throws IOException {
        if (isOn && volume > 0) {
            volume--;
            speaker.setVolume(volume);
            logger.log(String.format("Гучність зменшено до %s", volume));
            System.out.printf("Гучність зменшено до %s\n", volume);
        }
    }

    /**
     * Змінює розмір екрану телевізора.
     *
     * @param size Новий розмір екрану (у дюймах).
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void changeScreenSize(int size) throws IOException {
        screen.setSize(size);
        logger.log(String.format("Розмір екрану змінено на %s дюймів", size));
        System.out.printf("Розмір екрану змінено на %s дюймів\n", size);
    }

    /**
     * Змінює яскравість екрану телевізора.
     *
     * @param brightness Нова яскравість (0-100).
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void adjustBrightness(int brightness) throws IOException {
        if (isOn) {
            screen.setBrightness(brightness);
            logger.log(String.format("Яскравість екрану встановлено на %s", brightness));
            System.out.printf("Яскравість екрану встановлено на %s\n", brightness);
        }
    }

    /**
     * Замінює батарейки в пульті керування.
     *
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public void changeRemoteBatteries() throws IOException {
        remoteControl.changeBatteries();
        logger.log("Замінено батарейки в пульті керування");
        System.out.println("Замінено батарейки в пульті керування");
    }

    /**
     * Перевіряє стан телевізора.
     *
     * @return Рядок зі станом телевізора (ввімкнений/вимкнений, канал, гучність).
     * @throws IOException якщо виникає помилка при роботі з логом.
     */
    public String checkStatus() throws IOException {
        String status = "Телевізор " + (isOn ? "увімкнено" : "вимкнено") +
                ". Канал: " + currentChannel +
                ". Гучність: " + volume;

        logger.log(String.format("Перевірено стан: %s", status));
        System.out.printf("Перевірено стан: %s\n", status);
        return status;
    }

    /**
     * Закриває логер для збереження даних у файл.
     *
     * @throws IOException якщо виникає помилка під час закриття логера.
     */
    public void closeLogger() throws IOException {
        logger.close();
    }
}

