package com.homework.saladlib.vegetable;

public class SolidVgtbl extends Vegetable{
    public SolidVgtbl (String name, int weight){
        super(name, weight);
    }
    public String preparation(){
        return "Поварить, почистить и нарезать";
    }
}