package managers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputManagerTest {

    @Test
    public void checkInputIsAString() {
        InputManager inputManager = new InputManager();

        Boolean actualTrue = inputManager.checkInputIsAString("this is true");
        Boolean actualFalse = inputManager.checkInputIsAString(12);

        Assert.assertTrue(actualTrue);
        Assert.assertFalse(actualFalse);
    }

    @Test
    public void checkInputIsAInteger() {
        InputManager inputManager = new InputManager();

        Boolean actualTrue = inputManager.checkInputIsAInteger(12);
        Boolean actualFalse = inputManager.checkInputIsAInteger("this is false");

        Assert.assertTrue(actualTrue);
        Assert.assertFalse(actualFalse);
    }

    @Test
    public void checkInputIsADouble() {
        InputManager inputManager = new InputManager();

        Boolean actualTrue = inputManager.checkInputIsADouble(12.);
        Boolean actualFalse = inputManager.checkInputIsADouble("this is false");

        Assert.assertTrue(actualTrue);
        Assert.assertFalse(actualFalse);
    }
}