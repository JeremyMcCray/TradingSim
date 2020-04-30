package objects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelingTraderTest {

    TravelingTrader trader;

    @Before
    public void before(){
        Town town =  new Town.TownBuilder().build();
        Inventory bag = new Inventory(0,0,0,0,0,10);
        trader = new TravelingTrader("Tom", bag, 11, town);
    }

    @Test
    public void checkMoveDistanceRemainingTrue() {

        trader.setMoveDistanceRemaining(10);
        trader.checkMoveDistanceRemaining(8);

        Assert.assertTrue(trader.checkMoveDistanceRemaining(8));
    }

    @Test
    public void checkMoveDistanceRemainingFalse() {
        Town town =  new Town.TownBuilder().build();
        Inventory bag = new Inventory(0,0,0,0,0,10);
        TravelingTrader trader = new TravelingTrader("Tom", bag, 11, town);
        trader.setMoveDistanceRemaining(7);
        trader.checkMoveDistanceRemaining(8);

        Assert.assertFalse(trader.checkMoveDistanceRemaining(8));
    }

    @Test
    public void moveOnXAxis() {
        trader.setMoveDistanceRemaining(20);
        int actualPosition = trader.moveOnXAxis(11);


        Assert.assertEquals(actualPosition, 11);
    }

    @Test
    public void moveOnYAxis() {
    }
}