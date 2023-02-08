public class Circle {
    private int radius;
    private int x;

    public Circle(int x) {
        radius = x;
    }
    public double calculateArea() {
        double calculateArea;
        double pi = 3.141592653589793238;
        calculateArea = pi * radius * radius;
        return calculateArea;
    }

}
