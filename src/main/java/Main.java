import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1:");
        int myArray[] = {126, 13, -5, -28, 52, 8, 0, 1000, 3, 14};
        System.out.println(Arrays.toString(Task1.sortArray(myArray)));
        System.out.println("******************************************");


        System.out.println("Задание 2:");
        System.out.println("Top 5: ");
        List<String> arrayList = new ArrayList<>();
        System.out.println(Task2.hashtag(Task2.readFromFile(arrayList)));
        System.out.println("******************************************");


        System.out.println("Задание 3:");
        Figure cube = new Cube(2);
        Figure sphere = new Sphere(2);
        Figure cylinder = new Сylinder(2, 2);
        List<Figure> figures = new ArrayList<>();
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        System.out.println(Task3.arrayListSort(figures));

    }
}
