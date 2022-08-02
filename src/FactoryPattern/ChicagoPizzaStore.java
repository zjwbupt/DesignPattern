package FactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new ChicagoStylePizza();
        return null;
    }
}

