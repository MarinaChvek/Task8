package com.homework.statelib;


import java.util.List;
import java.util.Objects;

public class Country {
    private String capital;
    private static String country;
    public static boolean printInformation = true;

    public String getCapital(City[] cities) {
        for (City city : cities) {
            if (city.isCapital() == true) {
                capital = city.getCityName();
                break;
            }
        }
        return capital;
    }

    private int countOblast;

    public int getOblastAmount(City[] cities) {
        countOblast = 0;
        for (City city : cities) {
            if (city.returnOblastSquare() != 0) {
                countOblast++;
            }
        }
        return countOblast;
    }

    public void printOblasts(City[] cities) {
        double sumSquare = 0;
        for (City city : cities) {
            if (city.returnOblastSquare() != 0) {
                sumSquare = sumSquare + city.returnOblastSquare();
                System.out.println(city.returnRegionName() + " область: площадь: " + city.returnOblastSquare() + " км²,"
                        + " плотность населения: " + city.getPopulation() + " чел./км²");

            }
        }
        System.out.println("\nИтого: площаль страны: " + sumSquare + " км²");
    }

    public void printOblastCenters(City[] cities) {
        int countOblast = 0;
        System.out.println("\nОбластные центры:");
        for (City city : cities) {
            if (city.isOblastCenter() == true) {
                countOblast++;
                System.out.println(countOblast + ". " + city.getCityName());
                if (this.printInformation == true) {
                    System.out.printf("Наименование районов:");
                List<District> list=city.getDistricts();
                for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i).getDistrict()+", ");

                    }
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrint() {
        return printInformation;
    }

    public static void setPrint(boolean printInformation) {
        Country.printInformation = printInformation;
    }

    public static String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        Country.country = country;
    }

    public  void result( City[] cities) {


        System.out.println("Государство: " + getCountry());
        System.out.println("Столица государства:  " + getCapital(cities));
        System.out.println("Количество областей: " + getOblastAmount(cities) + "\n");
        printOblasts(cities);
        printOblastCenters(cities);
    }

    @Override
    public String toString() {
        return "Country{" +
                "capital='" + capital + '\'' +
                ", countOblast=" + countOblast +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countOblast == country.countOblast &&
                Objects.equals(capital, country.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capital, countOblast);
    }
}

