package FactoryPattern;

public class NyStyleCheesePizza extends Pizza{
    public NyStyleCheesePizza() {
        name = "NY style cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Norwegian Cheese");
    }
}
