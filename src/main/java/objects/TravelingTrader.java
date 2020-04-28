package objects;

import managers.OutputManager;
import objects.abstracts.AbstractTrader;

public class TravelingTrader extends AbstractTrader {

    int travelSpeed;
    int currentXLocation;
    int currentYLocation;
    Town startingLocation;
    int moveDistanceRemaining = travelSpeed;

    public TravelingTrader(String name, Inventory inventory, int speed, Town startingLocation) {
        super(name, inventory);
        this.travelSpeed = speed;
        this.startingLocation = startingLocation;
        this.currentXLocation= this.startingLocation.getXPosition();
        this.currentYLocation= this.startingLocation.getYPosition();
    }

    public boolean checkMoveDistanceRemaining(int distance){
        return distance < moveDistanceRemaining;
    }

    public int moveOnXAxis(int distance){
        if(checkMoveDistanceRemaining(distance)){
            currentXLocation += distance;
            moveDistanceRemaining -= distance;
        } else{
            System.out.println("You can't travel that far! Chose a distance under your remaining move speed. Remaining Speed: " + moveDistanceRemaining);
            return -1;
        }
        return currentXLocation;
    }

    public int moveOnYAxis(int distance){
        if(checkMoveDistanceRemaining(distance)){
            currentYLocation += distance;
            moveDistanceRemaining -= distance;
        } else{
            System.out.println("You can't travel that far! Chose a distance under your remaining move speed. Remaining Speed: " + moveDistanceRemaining);
            return -1;
        }
        return currentYLocation;
    }


}
