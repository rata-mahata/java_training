package tests.java.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void atestDistance() {
        Point p1 = new Point(2,3);
        Point p2 = new Point (4,5);
        Assert.assertEquals(p1.distance(p2),  2.8284271247461903);
    }
    @Test
    public void btestDistance() {
        Point p1 = new Point(2,3);
        Point p2 = new Point (4,5);
        Assert.assertNotEquals(p1.distance(p2),  20);
    }

}
