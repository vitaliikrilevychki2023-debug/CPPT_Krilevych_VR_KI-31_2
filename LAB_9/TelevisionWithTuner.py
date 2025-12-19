from Television import Television


class TelevisionWithTuner(Television):
    """
    Клас TelevisionWithTuner розширює функціональність базового класу Television,
    додаючи можливості роботи з тюнером.
    """

    def __init__(self, brand, model, screen_size, has_tuner):
        """
        Ініціалізує телевізор із тюнером.

        :param brand: Бренд телевізора.
        :param model: Модель телевізора.
        :param screen_size: Розмір екрана в дюймах.
        :param has_tuner: Наявність тюнера.
        """
        super().__init__(brand, model, screen_size)
        self.has_tuner = has_tuner
        self.tuner_enabled = False

    def enable_tuner(self):
        """
        Увімкнення тюнера.
        """
        if self.has_tuner:
            self.tuner_enabled = True
            print("Тюнер увімкнено.")
        else:
            print("Тюнер відсутній.")

    def disable_tuner(self):
        """
        Вимкнення тюнера.
        """
        if self.tuner_enabled:
            self.tuner_enabled = False
            print("Тюнер вимкнено.")
        else:
            print("Тюнер уже вимкнений.")

    def scan_channels(self):
        """
        Сканує доступні канали через тюнер.
        """
        if self.tuner_enabled:
            print("Сканування каналів завершено. Канали знайдено!")
        else:
            print("Тюнер вимкнений. Увімкніть його для сканування каналів.")

    def get_status(self):
        """
        Отримує статус телевізора із тюнером.
        """
        basic_status = super().get_status()
        tuner_status = "увімкнений" if self.tuner_enabled else "вимкнений"
        return f"{basic_status} Тюнер: {tuner_status}."

