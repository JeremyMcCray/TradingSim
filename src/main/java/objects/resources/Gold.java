package objects.resources;

import objects.abstracts.AbstractResource;

public class Gold extends AbstractResource {
    public Gold(String name, String description, Double baseCost, Integer size) {
        super("Gold", "The highest denomination of coin", 5., 0);
    }
}