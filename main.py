from TelevisionWithTuner import TelevisionWithTuner

if __name__ == "__main__":
    # Створюємо телевізор із тюнером
    tv = TelevisionWithTuner("LG", "SmartTV 4K", 55, True)

    # Виводимо початковий статус телевізора
    print("\n1. Початковий статус:")
    print(tv.get_status())

    # Увімкнення телевізора
    print("\n2. Увімкнення телевізора:")
    tv.power_on()

    # Перемикаємо канали
    print("\n3. Перемикання каналів:")
    tv.set_channel(5)
    tv.next_channel()
    tv.previous_channel()

    # Зміна гучності
    print("\n4. Зміна гучності:")
    tv.increase_volume()
    tv.decrease_volume()

    # Встановлюємо яскравість
    print("\n5. Встановлення яскравості:")
    tv.set_brightness(70)

    # Увімкнення/вимкнення Wi-Fi
    print("\n6. Налаштування Wi-Fi:")
    tv.enable_wifi()
    tv.disable_wifi()

    # Перемикання режимів тюнера
    print("\n7. Налаштування тюнера:")
    tv.enable_tuner()
    tv.scan_channels()

    # Вимкнення телевізора
    print("\n8. Вимкнення телевізора:")
    tv.power_off()
    print(tv.get_status())

