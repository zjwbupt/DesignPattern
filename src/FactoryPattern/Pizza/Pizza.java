package FactoryPattern.Pizza;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {

    }

    public void bake() {

    }

    public void cut()
    {

    }

    public void box() {}

    public String getName() {
        return name;
    }
}
