package objects.abstracts;

public abstract class AbstractResource {
    String name;
    String description;
    Integer baseCost;
    Integer size;

    public AbstractResource(String name, String description, Integer baseCost, Integer size) {
        this.name = name;
        this.description = description;
        this.baseCost = baseCost;
        this.size = size;
    }
}
