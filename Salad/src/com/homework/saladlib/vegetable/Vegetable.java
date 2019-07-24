package com.homework.saladlib.vegetable;

    public abstract class Vegetable {
        private int calorie;
        private int weight;
        private String name;


        Vegetable(String name, int weight) {
            this.name = name;
            this.weight = weight;

        }

        public abstract  String preparation();

       public  int getCalor() {
            switch (name){
                case "Чеснок": calorie=106; break;
                case "Перец":	calorie=25; break;
                case "Помидоры": calorie=19; break;
                case "Огурцы": calorie=15; break;
                case "Капуста": calorie=30; break;
                case "Морковь": calorie=33; break;
                case "Лук": calorie=43; break;
                case "Салат": calorie=14; break;
                case "Картофель":	calorie=83; break; //для калорійності ))
                default: calorie=0; System.out.println("Непонятный овощь");
            }

            return calorie;
        }

        public int getWeight() {
            return weight;
        }

        public String getName() {
            return name;
        }

    }

