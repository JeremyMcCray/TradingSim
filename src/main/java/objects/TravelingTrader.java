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

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public int getCurrentXLocation() {
        return currentXLocation;
    }

    public void setCurrentXLocation(int currentXLocation) {
        this.currentXLocation = currentXLocation;
    }

    public int getCurrentYLocation() {
        return currentYLocation;
    }

    public void setCurrentYLocation(int currentYLocation) {
        this.currentYLocation = currentYLocation;
    }

    public Town getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(Town startingLocation) {
        this.startingLocation = startingLocation;
    }

    public int getMoveDistanceRemaining() {
        return moveDistanceRemaining;
    }

    public void setMoveDistanceRemaining(int moveDistanceRemaining) {
        this.moveDistanceRemaining = moveDistanceRemaining;
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
