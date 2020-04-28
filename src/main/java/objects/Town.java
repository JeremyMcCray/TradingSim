package objects;

public class Town {
    String name;
    Inventory inventory;
    int xPos;
    int yPos;
    WealthLevel wealthLevel;

    public int getXPosition(){
        return this.xPos;
    }
    public int getYPosition(){
        return this.yPos;
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