package com.homework.saladlib.vegetable;

public class SoftVgtbl extends Vegetable{
    public SoftVgtbl (String name, int weight){
        super(name, weight);
    }
    public String preparation(){
        return "Нарезать";
    }
}