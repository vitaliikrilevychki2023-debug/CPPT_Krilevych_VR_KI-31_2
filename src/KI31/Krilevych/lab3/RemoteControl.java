package KI31.Krilevych.lab3;

/**
 * Клас `RemoteControl` представляє пульт керування телевізором з можливістю заміни батарейок.
 */
public class RemoteControl {
    private boolean hasBatteries;

    /**
     * Конструктор для створення пульта керування.
     * За замовчуванням батарейки присутні.
     */
    public RemoteControl() {
        this.hasBatteries = true;
    }

    /**
     * Змінює батарейки у пульті керування.
     * Після виконання методу батарейки вважаються заміненими.
     */
    public void changeBatteries() {
        this.hasBatteries = true;
    }
}

