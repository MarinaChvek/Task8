package com.homework.statelib;

import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        City[] cities = new City[6];

        cities[0] = new City("Минск", new Oblast("Минская", 1902.66, 208787),List.of(new District("Пуховический"), new District("Дзержинский")), true, true,
                208787);
        cities[1] = new City("Гродно", new Oblast("Гродненская", 2594.05, 49987), List.of(new District("Слонимский"), new District("Свислочский")), false,
                true, 49987);
        cities[2] = new City("Брест", new Oblast("Брестская", 1544.11, 42037), List.of(new District("Ивановский"), new District("Пинский")), false, true,
                42037);
        cities[3] = new City("Гомель", new Oblast("Гомельская", 1951.42, 68210), List.of(new District("Рогачёвский"), new District("Вороновский")), false,
                true, 68210);
        cities[4] = new City("Витебск", new Oblast("Витебская", 2705.12, 37206), List.of(new District("Полоцкий"), new District("Браславский")), false, true,
                37206);
        cities[5] = new City("Могилёв", new Oblast("Могилёвская", 1895.40, 40130), List.of(new District("Краснопольский"), new District("Мстиславский")), false,
                true, 40130);
        Country country = new Country();
        country.setCountry("Республика Беларусь");


        country.setPrint(true);

        country.result(cities);
    }
}
