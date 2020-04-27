package objects;

public class Inventory {
    int amountOfgems;
    int amountOfgold;
    int amountOfiron;
    int amountOfwood;
    int amountOfwheat;

    public Inventory(int gems, int iron, int wood, int wheat, int gold) {
        this.amountOfgems = gems;
        this.amountOfgold = gold;
        this.amountOfiron = iron;
        this.amountOfwood = wood;
        this.amountOfwheat = wheat;
    }
}
