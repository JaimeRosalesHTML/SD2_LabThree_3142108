// Name: Jaime Rosales
// Student Number: 3142108
package griffith;

public class Circle extends Shape {

    // Task: circle radius
    private double radius;

    // Task: constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Task: getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Task: override methods (do not implement yet)
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Task: include radius in toString
    @Override
    public String toString() {
        return "Circle{name='" + getName() + "', radius=" + radius + "}";
    }
}