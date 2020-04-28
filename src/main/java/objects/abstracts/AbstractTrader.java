package objects.abstracts;

import objects.Inventory;

public abstract class AbstractTrader {
    String name;
    Inventory inventory;

    public AbstractTrader(String name, Inventory inventory) {
        this.name = name;
        this.inventory = inventory;
    }

}
