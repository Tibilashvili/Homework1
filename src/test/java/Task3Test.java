import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task3Test extends TestCase {
    Figure cube;
    Figure sphere;
    Figure cylinder;
    List<Figure> figures = new ArrayList<>();

    @Before
    protected void setUp() {
        cube = new Cube(0);
        sphere = new Sphere(0);
        cylinder = new Сylinder(0,0);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
    }


    @Test
    public void testArrayListSort1() {
        List<String> expectedList = new ArrayList<>();
        List<String> result = Task3.arrayListSort(figures);
        for (Figure f : figures) {
            expectedList.add(f.getClass().toString() + " = " + f.getVolume());
        }
        assertEquals(expectedList, result);
    }

  @Test
    public void testArrayListSort2() {
        cube = new Cube(2);
        sphere = new Sphere(2);
        cylinder = new Сylinder(2,2);

        figures.add(cube);
        figures.add(cylinder);
        figures.add(sphere);
        List<String> expectedList = new ArrayList<>();
        List<String> result = Task3.arrayListSort(figures);
        for (Figure f : figures) {
            expectedList.add(f.getClass().toString() + " = " + f.getVolume());
        }
        assertEquals(expectedList, result);
    }




}