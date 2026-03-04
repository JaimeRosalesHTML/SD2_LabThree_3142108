// Name: Jaime Rosales
// Student Number: 3142108
package griffith;

public abstract class Shape {

    // Task: private name field
    private String name;

    // Task: constructor sets name
    public Shape(String name) {
        this.name = name;
    }

    // Task: getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Task: abstract methods
    public abstract double area();
    public abstract double perimeter();

    // Task: toString prints the name
    @Override
    public String toString() {
        return "Shape{name='" + name + "'}";
    }
}