public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Shape();
        rectangle.setCalculationStrategy(new RectangleAreaCalculationStrategy(5, 10));

        Shape triangle = new Shape();
        triangle.setCalculationStrategy(new TriangleAreaCalculationStrategy(4, 6));

        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Площа трикутника: " + triangle.calculateArea());
    }
}
