package Java20240326Exam1;

public class Triangle implements Shape {
    private double length;
    private double height;

    public Triangle() {
    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return length * height * 0.5;
    }
    @Override
    public double calculatePerimeter() {
        return length + height + Math.sqrt((length * length) + (height * height));
    }
}
