// Name: Jaime Rosales
// Student Number: 3142108
package griffith;

public class RightAngledTriangle extends Shape {

    // Task: attributes
    private double base;
    private double height;

    // Task: constructor
    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    // Task: getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Task: override methods (do not implement yet)
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    // Task: include attributes in toString
    @Override
    public String toString() {
        return "RightAngledTriangle{name='" + getName() + "', base=" + base + ", height=" + height + "}";
    }
}