package ru.geekbrains;

public class Chocolate extends Product{
    private int kkal;

    public int getKkal() {
        return kkal;
    }

    public Chocolate(String name, double price, int kkal){
        super(name, price);
        this.kkal = kkal;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, kkal);

    }
}
