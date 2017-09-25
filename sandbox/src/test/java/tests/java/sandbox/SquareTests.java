package tests.java.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(10);
        Assert.assertEquals(s.area(),  100.0);
    }
}