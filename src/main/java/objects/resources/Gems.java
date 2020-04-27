package objects.resources;

import objects.abstracts.AbstractResource;

public class Gems extends AbstractResource {
    public Gems(String name, String description, Integer baseCost, Integer size) {
        super("gems", description, baseCost, size);
    }
}