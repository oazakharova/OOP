package ru.geekbrains;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfMilk){
                if (product.getName() == name && ((BottleOfMilk)product).getVolume() == volume){
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int kkal){

        for (Product product : products){
            if (product instanceof Chocolate){
                if (product.getName() == name && ((Chocolate)product).getKkal() == kkal){
                    return (Chocolate)product;
                }
            }
        }
        return null;
    }


    //TODO: Разработать метод получения бутылки с молоком самостоятельно



}
