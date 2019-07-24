package com.homework.saladlib.vegetable;

public class VgtblWithPeel extends Vegetable{
    public VgtblWithPeel (String name, int weight){
        super(name, weight);
    }
    public String preparation(){
        return "Почистить и нарезать";
    }

}

