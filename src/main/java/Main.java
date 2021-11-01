import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1:");
        List<Integer> myArray = new ArrayList<>();
        myArray.add(126);
        myArray.add(13);
        myArray.add(-5);
        myArray.add(-28);
        myArray.add(52);
        myArray.add(8);
        myArray.add(0);
        myArray.add(1000);
        myArray.add(3);
        myArray.add(14);

       System.out.println(Task1.arrayListBubbleSort(myArray));
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
      //  figures.add(null);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        System.out.println(Task3.arrayListSort(figures));

    }
}
