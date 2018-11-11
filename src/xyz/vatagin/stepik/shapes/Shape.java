package xyz.vatagin.stepik.shapes;


public abstract class Shape {

    private final Circle.Color color;

    public Circle.Color getColor() {
        return color;
    }

    public Shape(Circle.Color color) {
        this.color = color;
    }

    public abstract double getArea();
}
