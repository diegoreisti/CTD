
// https://dzone.com/articles/using-flyweight-design-pattern-in-java

public enum CoffeeFlavour {
    CAPPUCCINO("Cappucino"),
    ESPRESSO("Espresso"),
    FRAPPUCCINO("Frappuccino"),
    AFFOGATO("Affogato"),
    LATTE("Latte");

    private String name;

    CoffeeFlavour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
