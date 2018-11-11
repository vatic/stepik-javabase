package xyz.vatagin.stepik.shapes;

public class Circle extends Shape {

    private final Point center;
    private final double radius;
    public static final double PI = 3.14F;

    public Circle(Point center, double radius, Color color) {
        super(color);
        this.center = center;
        this.radius = radius;
        test(10);
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public  double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + getColor() +
                "}";
    }

    private final int test(final int a) {
        return 1;
    }

    public enum Color {
        BLACK,
        WHITE,
        RED,
        GREEN,
        BLUE
    }
}
