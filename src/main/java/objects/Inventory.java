package objects;

public class Inventory {
    int amountOfGems;
    int amountOfGold;
    int amountOfIron;
    int amountOfWood;
    int amountOfWheat;

    public Inventory(int gems, int iron, int wood, int wheat, int gold) {
        this.amountOfGems = gems;
        this.amountOfGold = gold;
        this.amountOfIron = iron;
        this.amountOfWood = wood;
        this.amountOfWheat = wheat;
    }
}
