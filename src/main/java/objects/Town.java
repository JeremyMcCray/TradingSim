package objects;

public class Town {
    String name;
    Inventory inventory;
    int xPos;
    int yPos;
    WealthLevel wealthLevel;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getXPosition(){
        return this.xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPosition(){
        return this.yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public WealthLevel getWealthLevel() {
        return wealthLevel;
    }

    public void setWealthLevel(WealthLevel wealthLevel) {
        this.wealthLevel = wealthLevel;
    }

    public Town(String name, Inventory inventory, int xPos, int yPos, WealthLevel wealthLevel) {
        this.name = name;
        this.inventory = inventory;
        this.xPos = xPos;
        this.yPos = yPos;
        this.wealthLevel = wealthLevel;
    }

    public Town(TownBuilder TownBuilder){
        this.wealthLevel = TownBuilder.wealthLevel;
        this.xPos = TownBuilder.xPos;
        this.yPos = TownBuilder.yPos;
        this.inventory = TownBuilder.inventory;
        this.name = TownBuilder.name;

}

    public enum WealthLevel{
        VERY_POOR,
        POOR,
        AVERAGE,
        WEALTHY,
        THRIVING
    }
    static class TownBuilder {
        private String name;
        private Inventory inventory;
        private int xPos;
        private int yPos;
        private Town.WealthLevel wealthLevel;

        public TownBuilder() {
        }

        TownBuilder(String name, Inventory inventory, int xPos, int yPos) {
            this.name = name;
            this.inventory = inventory;
            this.xPos = xPos;
            this.yPos = yPos;
        }

        public TownBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TownBuilder inventory(Inventory inventory) {
            this.inventory = inventory;
            return this;
        }

        public TownBuilder xPos(int xPos) {
            this.xPos = xPos;
            return this;
        }

        public TownBuilder yPos(int yPos) {
            this.yPos = yPos;
            return this;
        }

        public TownBuilder townWealth(Town.WealthLevel wealthLevel) {
            this.wealthLevel = wealthLevel;
            return this;
        }

        public Town build() {
            return new Town(this);
        }

    }


}