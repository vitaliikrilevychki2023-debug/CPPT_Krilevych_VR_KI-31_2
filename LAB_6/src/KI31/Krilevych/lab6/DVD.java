package KI31.Krilevych.lab6;

/**
 * Клас, що представляє DVD диск
 */
class DVD implements Comparable<DVD> {
    private String title;
    private int duration;
    private int year;

    /**
     * Конструктор класу DVD
     * @param title назва диску
     * @param duration тривалість у хвилинах
     * @param year рік випуску
     */
    public DVD(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DVD{title='" + title + "', duration=" + duration + ", year=" + year + "}";
    }

    @Override
    public int compareTo(DVD other) {
        return Integer.compare(this.duration, other.duration);
    }
}

