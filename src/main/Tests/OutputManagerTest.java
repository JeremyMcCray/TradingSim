import managers.OutputManager;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OutputManagerTest {

    //Test to make sure Que is LIFO
    @Test
    public void addToQue() {
        OutputManager.addToQue("1");
        OutputManager.addToQue("2");
        OutputManager.addToQue("3");
        OutputManager.addToQue("4");


        Assert.assertEquals(OutputManager.quedOutputs.pop(), "1");

        OutputManager.outputAllQued();
    }
}