package objects;

import objects.abstracts.AbstractTrader;

public class TravelingTrader extends AbstractTrader {

    int travelSpeed;
    int currentXLocation;
    int currentYLocation;
    Town startingLocation;


    public TravelingTrader(String name, Inventory inventory, int speed, Town startingLocation) {
        super(name, inventory);
        this.travelSpeed = speed;
        this.startingLocation = startingLocation;
        this.currentXLocation= this.startingLocation.getXPosition();
        this.currentYLocation= this.startingLocation.getYPosition();
    }

}
