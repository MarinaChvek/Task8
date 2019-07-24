package com.homework.intervallib;

public class Main {

    public static void main(String[] args) {
        IntervalList newIntervals=new IntervalList ();


        Interval i1= new Interval(0, 5, true);
        Interval i2= new Interval(-5, 5, false);
        Interval i3 = new Interval(7, 12, true);
        newIntervals.addInterval(i1);
        newIntervals.addInterval(i2);
        newIntervals.addInterval(i3);


        for (int i = 0; i < newIntervals.size() - 1; i++) {
            for (int j = i+1; j < newIntervals.size() ; j++) {
                newIntervals.get(i).combine(newIntervals.get(j));
                newIntervals.get(i).crossing(newIntervals.get(j));
            }
        }
        newIntervals.maxRas();
    }
}
