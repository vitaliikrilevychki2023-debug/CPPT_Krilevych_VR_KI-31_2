package KI31.Krilevych.lab3;

/**
 * Клас `Speaker` представляє динамік телевізора з можливістю налаштування гучності.
 */
public class Speaker {
    private int maxVolume;
    private int currentVolume;

    /**
     * Конструктор для створення динаміка з вказаною максимальною гучністю.
     *
     * @param maxVolume Максимальна гучність динаміка.
     */
    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = maxVolume / 2; // За замовчуванням встановлюється половина від максимальної гучності
    }

    /**
     * Встановлює нову гучність для динаміка. Якщо вказана гучність перевищує
     * максимальну, вона автоматично обмежується максимальним значенням.
     *
     * @param volume Нова гучність.
     */
    public void setVolume(int volume) {
        this.currentVolume = Math.min(volume, maxVolume);
    }
}

