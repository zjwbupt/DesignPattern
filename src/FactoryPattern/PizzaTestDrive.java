package FactoryPattern;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Store.ChicagoPizzaStore;
import FactoryPattern.Store.NYPizzaStore;
import FactoryPattern.Store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joey ordered a " + pizza.getName() + "\n");
    }
}
