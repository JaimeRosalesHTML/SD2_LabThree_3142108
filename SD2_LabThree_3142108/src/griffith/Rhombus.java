// Name: Jaime Rosales
// Student Number: 3142108
package griffith;

public class Rhombus extends Shape {

    // Task: attributes
    private double diagonal1;
    private double diagonal2;
    private double side;

    // Task: constructor
    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    // Task: getters and setters
    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Task: override methods (do not implement yet)
    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    // Task: include attributes in toString
    @Override
    public String toString() {
        return "Rhombus{name='" + getName() + "', d1=" + diagonal1 + ", d2=" + diagonal2 + ", side=" + side + "}";
    }
}