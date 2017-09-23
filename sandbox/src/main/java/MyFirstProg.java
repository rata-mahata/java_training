public class MyFirstProg {

    public static void main(String[] args) {

        Square s = new Square(7);
        System.out.println("area with length " + s.l + " equals " + s.area());

        Rectangle r = new Rectangle(6, 9);
        System.out.println("rectangle area with length " + r.a + "and " + r.b + " equals " + r.area());


        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 2;
        p1.y = 3;
        p2.x = 5;
        p2.y = 4;
        System.out.println("Distance between points P1(" + p1.x +"," + p1.y + ") and P2(" + p2.x + "," + p2.y + ") equals " + distance (p1, p2));

    }

    public static double distance (Point p1, Point p2) {

        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));

    }
}

