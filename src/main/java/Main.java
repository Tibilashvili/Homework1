import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1:");
        List<Integer> myArray1 = new ArrayList<>();
        myArray1.add(126);
        myArray1.add(13);
        myArray1.add(-5);
        myArray1.add(-28);
        myArray1.add(52);
        myArray1.add(8);
        myArray1.add(0);
        myArray1.add(1000);
        myArray1.add(3);
        myArray1.add(14);

        List<Integer> myArray2 = new ArrayList<>();
        myArray2.add(5);
        myArray2.add(null);


 // System.out.println(Task1.arrayListBubbleSort(myArray1));
 // System.out.println(Task1.arrayListBubbleSort(myArray2));
 //  System.out.println(Task1.arrayListBubbleSort(null));


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
        figures.add(null);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
      // System.out.println(Task3.arrayListSort(figures));
      //  System.out.println(Task3.arrayListSort(null));

    }
}
