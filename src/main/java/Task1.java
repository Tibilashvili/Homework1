public class Task1 {
    public static int[] sortArray(int myArray[]) {

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


