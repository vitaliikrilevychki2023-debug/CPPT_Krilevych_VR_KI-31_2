package KI31.Krilevych;

/**
 * Клас `Screen` представляє екран телевізора з можливістю налаштування розміру та яскравості.
 */
public class Screen {
    private int size;
    private int brightness;

    /**
     * Конструктор для створення екрану з вказаним розміром.
     *
     * @param size Розмір екрану у дюймах.
     */
    public Screen(int size) {
        this.size = size;
        this.brightness = 50; // За замовчуванням яскравість встановлена на 50
    }

    /**
     * Встановлює новий розмір екрану.
     *
     * @param size Новий розмір екрану у дюймах.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Встановлює новий рівень яскравості екрану.
     *
     * @param brightness Нова яскравість екрану (0-100).
     */
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
