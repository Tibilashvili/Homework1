import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static Object arrayListBubbleSort(List<Integer> list) {  // List <Integer>

        List<String> weHaveNull = new ArrayList<>();
        weHaveNull.add("we have null");

        if ((list != null) && (!list.isEmpty())) {


            for (int k = 0; k < list.size(); k++){
                if(list.get(k) == null){
                    return weHaveNull;
                }
            }


            Integer temp;


            for (int i = list.size() - 1; i > 0; i--) {
                // if (list.get(i) != null) {
                for (int j = 0; j < i; j++) {
                  //  if (list.get(j) != null) {
                        if (list.get(j) <= 0) {
                            list.remove(j);
                        }
                        if (list.get(j) > list.get(j + 1)) {
                            temp = list.get(j + 1);
                            list.set(j + 1, list.get(j));
                            list.set(j, temp);

                        }

                }

            }

            Collections.reverse(list);

        }

        else {
            return weHaveNull;

        }
        return list;
    }


    public static int[] sortArray(int myArray[]) {

        if (myArray != null) {


            int count = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > 0) {
                    count++;
                }
            }

            int[] newArray = new int[count];

            int count2 = 0;

            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > 0) {
                    newArray[count2++] = myArray[i];

                }
            }


            bubbleSort(newArray);

            return newArray;

        }


        else {

            return null;
        }
    }








    public static int[] bubbleSort(int[] newArray) {
        for (int i = newArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp = 0;
                if (newArray[j + 1] > newArray[j]) {
                    temp = newArray[j + 1];
                    newArray[j + 1] = newArray[j];
                    newArray[j] = temp;
                }

            }
        }

        return newArray;
    }


}






