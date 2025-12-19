class Television:
    """
    Клас Television представляє базовий телевізор.
    """

    def __init__(self, brand, model, screen_size):
        """
        Ініціалізує телевізор.

        :param brand: Бренд телевізора.
        :param model: Модель телевізора.
        :param screen_size: Розмір екрана в дюймах.
        """
        self.brand = brand
        self.model = model
        self.screen_size = screen_size
        self.is_powered_on = False
        self.current_channel = 1
        self.volume = 50  # від 0 до 100
        self.brightness = 50  # від 0 до 100
        self.wifi_enabled = False

    def power_on(self):
        """
        Увімкнення телевізора.
        """
        self.is_powered_on = True
        print("Телевізор увімкнено.")

    def power_off(self):
        """
        Вимкнення телевізора.
        """
        self.is_powered_on = False
        print("Телевізор вимкнено.")

    def set_channel(self, channel):
        """
        Встановлює канал.

        :param channel: Номер каналу.
        """
        if self.is_powered_on:
            self.current_channel = channel
            print(f"Канал перемкнено на {channel}.")
        else:
            print("Телевізор вимкнений. Увімкніть його для перемикання каналів.")

    def next_channel(self):
        """
        Перемикає на наступний канал.
        """
        if self.is_powered_on:
            self.current_channel += 1
            print(f"Перемкнуто на канал {self.current_channel}.")
        else:
            print("Телевізор вимкнений.")

    def previous_channel(self):
        """
        Перемикає на попередній канал.
        """
        if self.is_powered_on:
            self.current_channel = max(1, self.current_channel - 1)
            print(f"Перемкнуто на канал {self.current_channel}.")
        else:
            print("Телевізор вимкнений.")

    def increase_volume(self):
        """
        Збільшує гучність.
        """
        if self.is_powered_on and self.volume < 100:
            self.volume += 1
            print(f"Гучність: {self.volume}.")
        elif not self.is_powered_on:
            print("Телевізор вимкнений.")

    def decrease_volume(self):
        """
        Зменшує гучність.
        """
        if self.is_powered_on and self.volume > 0:
            self.volume -= 1
            print(f"Гучність: {self.volume}.")
        elif not self.is_powered_on:
            print("Телевізор вимкнений.")

    def set_brightness(self, brightness):
        """
        Встановлює яскравість.

        :param brightness: Значення яскравості (від 0 до 100).
        """
        if self.is_powered_on:
            self.brightness = max(0, min(100, brightness))
            print(f"Яскравість встановлено на {self.brightness}%.")
        else:
            print("Телевізор вимкнений.")

    def enable_wifi(self):
        """
        Увімкнення Wi-Fi.
        """
        self.wifi_enabled = True
        print("Wi-Fi увімкнено.")

    def disable_wifi(self):
        """
        Вимкнення Wi-Fi.
        """
        self.wifi_enabled = False
        print("Wi-Fi вимкнено.")

    def get_status(self):
        """
        Отримує статус телевізора.
        """
        power_status = "увімкнений" if self.is_powered_on else "вимкнений"
        return f"Телевізор {self.brand} {self.model}, {self.screen_size}\" - {power_status}."

