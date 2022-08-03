package FactoryPattern.Store;

import FactoryPattern.Pizza.ChicagoStylePizza;
import FactoryPattern.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new ChicagoStylePizza();
        return null;
    }
}

