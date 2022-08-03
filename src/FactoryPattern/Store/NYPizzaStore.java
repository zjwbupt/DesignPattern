package FactoryPattern.Store;

import FactoryPattern.Pizza.NyStyleCheesePizza;
import FactoryPattern.Pizza.NyStyleVeggiePizza;
import FactoryPattern.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new NyStyleCheesePizza();
        if (item.equals("veggie"))
            return new NyStyleVeggiePizza();
        return null;
    }
}
