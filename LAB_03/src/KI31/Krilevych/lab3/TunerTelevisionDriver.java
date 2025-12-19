package KI31.Krilevych.lab3;

import java.io.IOException;

/**
 * Клас `TelevisionDriver` містить точку входу в програму та демонструє роботу з телевізором,
 * викликаючи різні методи класу `Television`.
 */
public class TunerTelevisionDriver {
    /**
     * Точка входу в програму. Демонструє роботу з телевізором шляхом виклику різних методів.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        try {
            TunerTelevision tv = new TunerTelevision(
                    new Screen(55),
                    new Speaker(100),
                    new RemoteControl()
            );

            tv.turnOn();
            tv.scanChannels();
            tv.changeChannelUp();
            tv.addFavoriteChannel(5);
            tv.addFavoriteChannel(10);
            tv.volumeUp();
            tv.adjustBrightness(75);
            tv.removeFavoriteChannel(5);
            tv.checkStatus();
            tv.turnOff();

            tv.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

