package FactoryPattern.Pizza;

public class ChicagoStylePizza extends Pizza{
    public ChicagoStylePizza() {
        name = "Chicago style cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Chicago Cheese");
    }
}
