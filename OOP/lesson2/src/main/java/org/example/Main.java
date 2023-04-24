package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Персик", 10);
        // System.out.println(cat1.infoAboutCat());
        Cat cat2 = new Cat("Барсик", 12);
        Cat cat3 = new Cat("Мурзик", 15);
        Cat cat4 = new Cat("Беляш", 20);
        Cat cat5 = new Cat("Леопольд", 9);
        Cat cat6 = new Cat("Умка", 10);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);

        int food = 50;
        Plate plate1 = new Plate(food);
        System.out.println(plate1.infoAboutPlate());

        /**
        cat1.eat(plate1);
        System.out.println(plate1.infoAboutPlate());
        cat2.eat(plate1);
        System.out.println(plate1.infoAboutPlate());
        cat3.eat(plate1);
        System.out.println(plate1.infoAboutPlate());
        cat4.eat(plate1);
        System.out.println(plate1.infoAboutPlate());
        cat5.eat(plate1);
        System.out.println(plate1.infoAboutPlate());
        cat6.eat(plate1);
        System.out.println(plate1.infoAboutPlate());
         */

        cats.forEach(cat -> cat.eat(plate1));

        cats.forEach(cat -> {
            if(cat.getSitost()){
                System.out.println("Кот " + cat.getName() + " сыт");
            } else
                System.out.println("Кот " + cat.getName() + " голоден");
        });

        System.out.println(plate1.infoAboutPlate());

    }

}

