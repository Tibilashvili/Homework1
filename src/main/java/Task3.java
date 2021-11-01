import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static List<String> arrayListSort(List<Figure> list) {

        Figure temp;

        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).getVolume() > list.get(j + 1).getVolume()) {
                    temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }

            }
        }

        return printList(list);

    }

    public static List<String> printList(List<Figure> list){
        List<String> newArrayList = new ArrayList<>();
        for (Figure f : list) {
            newArrayList.add(f.getClass() + " = " + f.getVolume());
        }
        return newArrayList;

    }
}




