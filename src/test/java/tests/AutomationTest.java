package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationTest {

    @Test
    public void smokeTest() {
        System.out.println("Abd automation test executed successfully");
        Assert.assertEquals(1, 1);
    }
}
