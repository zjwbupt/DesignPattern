package FactoryPattern.Pizza;

public class NyStyleVeggiePizza extends Pizza {
    public NyStyleVeggiePizza() {
        name = "NY style veggie pizza";
        dough = "Thin Crust Dough";
        sauce = "Veggie Sauce";

        toppings.add("Grated Norwegian Veggie");
    }
}
