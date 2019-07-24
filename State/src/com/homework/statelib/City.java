package com.homework.statelib;

import java.util.List;
import java.util.Objects;

public class City {

    private String cityName;
    private String oblast;
    private double oblastSquare;
    private boolean isCapital;
    private boolean isOblastCenter;
    private double population;
    private List<District> districtsList;

    public City(String cityName, Oblast oblast,  List<District> districtsList, boolean isCapital, boolean isOblastCenter, double population) {
        this.cityName = cityName;
        this.oblast = oblast.getRegionName();
        this.oblastSquare = oblast.getSquare();
        this.districtsList=districtsList;
        this.isCapital = isCapital;
        this.isOblastCenter = isOblastCenter;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public double returnOblastSquare() {
        return oblastSquare;
    }

    public String returnRegionName() {
        return oblast;
    }

    public boolean isOblastCenter() {
        return isOblastCenter;
    }

    public List<District> getDistricts() {
        return   districtsList;
    }

    public void setDistrict(List<District> districtsList) {
        this.districtsList = districtsList;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(city.oblastSquare, oblastSquare) == 0 &&
                isCapital == city.isCapital &&
                isOblastCenter == city.isOblastCenter &&
                Double.compare(city.population, population) == 0 &&
                Objects.equals(cityName, city.cityName) &&
                Objects.equals(oblast, city.oblast) &&
                Objects.equals(districtsList, city.districtsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, oblast, oblastSquare, isCapital, isOblastCenter, population, districtsList);
    }
}