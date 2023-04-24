package org.example;

public class Cat {
    private String name;
    private int appetite;
    private boolean sitost;


    public Cat() {
        this("Котик");
    }

    public Cat(String name) {
        this(name, 10);
    }

    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }

    public Cat(String name, int appetite, boolean sitost) {
        this.name = name;
        this.appetite = appetite;
        this.sitost = false;
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSitost() {
        return sitost;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setSitost(boolean sitost) {
        this.sitost = sitost;
    }

    public void eat(Plate plate) {
        if (sitost == false && plate.getFood() > appetite) {
            plate.setFood(plate.getFood() - appetite);
            sitost = true;
            System.out.printf("Коту %s удалось покушать, съедено %d еды\n", name, appetite);
        } else if (sitost == false && plate.getFood() < appetite) {
            System.out.printf("Коту %s не удалось покушать, так как не хватило еды\n", name);
        } else {
            System.out.printf("Кот %s не хочет кушать\n", name);
        }
    }




    String infoAboutCat(){
        return String.format("%s - %d - %s", name, appetite, sitost);
    }

}
