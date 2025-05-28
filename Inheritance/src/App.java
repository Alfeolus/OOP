public class App {
    public static void main(String[] args) throws Exception {
        Geometry circle = new Circle(7f);
        Geometry square = new Square(10f);

        circle.area = 99;
        circle.circumference = 99;

        square.recalculate();       
        circle.recalculate();
    }
}
