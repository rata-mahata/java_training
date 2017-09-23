public class MyFirstProg {

    public static void main(String[] args) {
        hello("world");
        hello("you");

        Square s = new Square(7);
        System.out.println("area with length " + s.l + " equals " + s.area());

        Rectangle r = new Rectangle(6, 9);
        System.out.println("rectangle area with length " + r.a + "and " + r.b + " equals " + r.area());

    }
    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "?");
    }


}

