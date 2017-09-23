public class MyFirstProg {

    public static void main(String[] args) {
        hello("world");
        hello("you");
        double x = 4;
        System.out.println("area with length " + x + " equals " + area(x));

        double v=5;
        double y=7;
        System.out.println("rectangle area with length " + v + "and " + y + " equals " + area(v, y));

    }
    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "?");
    }

    public static double area(double l) {
        return l*l;
    }

    public static double area(double a, double b) {
        return a*b;
    }
}

