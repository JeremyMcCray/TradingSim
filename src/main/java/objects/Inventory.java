package objects;

public class Inventory {
    int amountOfGems;
    int amountOfGold;
    int amountOfIron;
    int amountOfWood;
    int amountOfWheat;
    int capacity;

    public Inventory(int gems, int iron, int wood, int wheat, int gold, int capacity) {
        this.amountOfGems = gems;
        this.amountOfGold = gold;
        this.amountOfIron = iron;
        this.amountOfWood = wood;
        this.amountOfWheat = wheat;
        this.capacity = capacity;
    }

    public int increaseAmountOfGems(int amount){
        amountOfGems += amount;
        return amountOfGems;
    }

    public int increaseAmountOfWood(int amount){
        amountOfWood += amount;
        return amountOfWood;
    }

    public int increaseAmountOfIron(int amount){
        amountOfIron += amount;
        return amountOfIron;
    }

    public int increaseAmountOfWheat(int amount){
        amountOfWheat += amount;
        return amountOfWheat;
    }

    public int increaseAmountOfGold(int amount){
        amountOfGold += amount;
        return amountOfGold;
    }

    public int increaseCapacity(int amount){
        capacity += amount;
        return capacity;
    }

    public int getAmountOfGems() {
        return amountOfGems;
    }

    public void setAmountOfGems(int amountOfGems) {
        this.amountOfGems = amountOfGems;
    }

    public int getAmountOfGold() {
        return amountOfGold;
    }

    public void setAmountOfGold(int amountOfGold) {
        this.amountOfGold = amountOfGold;
    }

    public int getAmountOfIron() {
        return amountOfIron;
    }

    public void setAmountOfIron(int amountOfIron) {
        this.amountOfIron = amountOfIron;
    }

    public int getAmountOfWood() {
        return amountOfWood;
    }

    public void setAmountOfWood(int amountOfWood) {
        this.amountOfWood = amountOfWood;
    }

    public int getAmountOfWheat() {
        return amountOfWheat;
    }

    public void setAmountOfWheat(int amountOfWheat) {
        this.amountOfWheat = amountOfWheat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
