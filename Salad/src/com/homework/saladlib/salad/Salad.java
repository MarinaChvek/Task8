package com.homework.saladlib.salad;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.homework.saladlib.vegetable.*;

public class Salad {
    String name;
    List<Vegetable> salad;

    public Salad() {
        salad = new ArrayList<Vegetable>();
    }


    public Salad(String name, Vegetable... components) {
        this.name = name;
        salad = new ArrayList<Vegetable>();
        for (Vegetable v : components) {
            this.salad.add(v);
        }
    }

    private String getName() {
        return name;
    }

    public Salad setName(String name) {
        this.name = name;
        return this;
    }

    public Salad setComponent(Vegetable v) {
        this.salad.add(v);
        return this;
    }

    private int foodValue() {
        int v = 0;
        for (Vegetable c : salad) {
            v += Math.round((double) c.getWeight() * c.getCalor() / 100);
        }
        return v;
    }

    public static Comparator<Vegetable> salad1 = new Comparator<Vegetable>() {

        @Override
        public int compare(Vegetable one, Vegetable two) {
            if (one.getCalor() == two.getCalor()) {
                return 0;
            } else if (one.getCalor() > two.getCalor()) {
                return 1;
            } else if (one.getCalor() < two.getCalor()) {
                return -1;
            }
            return 0;
        }
    };


    public void SortAndCook() {  //Это сортировка по величине каллорийности овощей
        salad.sort(Salad.salad1);
        System.out.println("Салат " + this.getName());
        for (Vegetable v : salad) {
            System.out.println("Ингридиент - " + v.getName() + " каллорийности " + v.getCalor() + " нужно " + v.preparation());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Салат " + this.getName();
    }

    public void  findCopmonentsInRange(double minCal, double maxCal) {  //Это нахождение овощей в нужно диапазоне каллорийности

        ArrayList<Vegetable> result = new ArrayList();

        for (Vegetable component : salad) {
            double current = component.getCalor();
            if (current >= minCal && current <= maxCal) {
                result.add(component);
            }
        }
        for (Vegetable r : result) {
            System.out.print(r.getName()+" - "+r.getCalor()+" ккал, ");
            }
        }
    }
