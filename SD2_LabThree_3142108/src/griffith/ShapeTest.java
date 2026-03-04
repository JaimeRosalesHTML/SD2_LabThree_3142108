// Name: Jaime Rosales
// Student Number: 3142108
package griffith;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Unit tests for the Shape subclasses.
 * Using epsilon 0.1 for floating point comparisons.
 */

public class ShapeTest {

    private static final double EPSILON = 0.1;

    // Test Circle
    @Test
    public void testCircleAreaPerimeterToString() {

        Circle c = new Circle("Circle", 3.5);

        assertEquals(38.48, c.area(), EPSILON);
        assertEquals(21.99, c.perimeter(), EPSILON);

        assertTrue(c.toString().contains("Circle"));
        assertTrue(c.toString().contains("radius=3.5"));
    }

    // Test Rhombus
    @Test
    public void testRhombusAreaPerimeterToString() {

        Rhombus r = new Rhombus("Rhombus", 10, 6, 5);

        assertEquals(30.0, r.area(), EPSILON);
        assertEquals(20.0, r.perimeter(), EPSILON);

        assertTrue(r.toString().contains("Rhombus"));
        assertTrue(r.toString().contains("side=5.0"));
    }

    // Test RightAngledTriangle
    @Test
    public void testRightAngledTriangleAreaPerimeterToString() {

        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);

        assertEquals(6.0, t.area(), EPSILON);
        assertEquals(12.0, t.perimeter(), EPSILON);

        assertTrue(t.toString().contains("Triangle"));
        assertTrue(t.toString().contains("base=3.0"));
    }

    // Integration Test
    @Test
    public void integrationTestShapesArrayList() {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 2.0));

        shapes.add(new Rhombus("Rhombus", 10, 6, 5));
        shapes.add(new Rhombus("Rhombus", 8, 4, 4));

        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        for (Shape s : shapes) {

            assertTrue(s.area() >= 0);
            assertTrue(s.perimeter() >= 0);

        }
    }
}