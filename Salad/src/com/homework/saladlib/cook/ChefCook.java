package com.homework.saladlib.cook;

import com.homework.saladlib.salad.Salad;
import com.homework.saladlib.vegetable.*;

import java.util.Arrays;


public class ChefCook {
        public static void main(String[] args) {
            Salad salad3 = new Salad("Афигенный", new SolidVgtbl("Морковь", 100), new VgtblWithPeel("Лук", 2), new SoftVgtbl("Салат", 100), new SoftVgtbl("Помидоры", 50)
                    , new SoftVgtbl("Перец", 50), new SolidVgtbl("Картофель", 200));

            salad3.SortAndCook();// сортировка по величине каллорийности
            salad3.findCopmonentsInRange(10,40); //овощи в нужном диапазоне каллорийности

        }
    }





