package org.example;

public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            System.out.println("Нельзя заполнить миску отрицательным количеством корма");}
    }
    String infoAboutPlate(){
        return String.format("В миске осталось %d корма", food);
    }
}
