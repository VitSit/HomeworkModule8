public class ShapePrinter {
    public void print(Shape shape) {
        System.out.println("Shape name is: " + shape.getName());
    }
    public static void main(String[] args) {
        Shape circle = new Circle("Red");
        Shape quad = new Quad("Green");
        Shape cube = new Cube("Blue");
        Shape triangle = new Triangle("Yellow");
        Shape rectangle = new Rectangle("White");
        ShapePrinter printer = new ShapePrinter();

        printer.print(circle);
        printer.print(quad);
        printer.print(cube);
        printer.print(triangle);
        printer.print(rectangle);
    }
}
