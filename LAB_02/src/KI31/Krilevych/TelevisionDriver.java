package KI31.Krilevych;

import java.io.IOException;

/**
 * Клас `TelevisionDriver` містить точку входу в програму та демонструє роботу з телевізором,
 * викликаючи різні методи класу `Television`.
 */
public class TelevisionDriver {
    /**
     * Точка входу в програму. Демонструє роботу з телевізором шляхом виклику різних методів.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        try {
            // Створення об'єкта телевізора з екраном, динаміком та пультом керування
            Television tv = new Television(
                    new Screen(62),
                    new Speaker(100),
                    new RemoteControl()
            );

            // Виклик методів для демонстрації функціоналу телевізора
            tv.turnOn();
            tv.changeChannelUp();
            tv.changeChannelDown();
            tv.volumeUp();
            tv.volumeDown();
            tv.changeScreenSize(61);
            tv.adjustBrightness(64);
            tv.changeRemoteBatteries();
            tv.checkStatus();
            tv.turnOff();

            // Закриття логера для збереження даних у файл
            tv.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}

