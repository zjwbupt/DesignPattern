package FactoryPattern;

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
