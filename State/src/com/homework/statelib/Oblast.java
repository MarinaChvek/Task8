package com.homework.statelib;

import java.util.Objects;

public class Oblast {

    private String oblastName;
    private double square;

    public Oblast(String oblastName, double square, double population) {
        this.oblastName = oblastName;
        this.square = square;
    }

    public String getRegionName() {
        return oblastName;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Oblast{" +
                "oblastName='" + oblastName + '\'' +
                ", square=" + square +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oblast oblast = (Oblast) o;
        return Double.compare(oblast.square, square) == 0 &&
                Objects.equals(oblastName, oblast.oblastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oblastName, square);
    }
}