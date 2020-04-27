package objects;

public class Inventory {
    int numGems;
    int numGold;
    int numIron;
    int numWood;
    int numWheat;

    public Inventory(int gems, int iron, int wood, int wheat, int gold) {
        this.numGems = gems;
        this.numGold = gold;
        this.numIron = iron;
        this.numWood = wood;
        this.numWheat = wheat;
    }
}
