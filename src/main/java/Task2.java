import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {

    public static List readFromFile(List<String> arrayList){
        try (Scanner scanner = new Scanner(new File("src/main/java/file.txt"))) {
            while (scanner.hasNext()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return arrayList;

    }



    public static List hashtag(List<String> arrayList) {

        TreeMap<String, Integer> wordsCount = new TreeMap<>();



        String[] newArray;

        for (String s : arrayList) {

            List<String> newArrayList = Arrays.asList(s.split(" "));

            HashSet<String> hashSet = new HashSet<>(newArrayList);


            for (String a : hashSet) {


                if (a.startsWith("#")) {


                   if(a.endsWith(".") || a.endsWith(",") || a.endsWith("!")){
                        a = a.substring(0, a.length() - 1);
                    }

                    if (wordsCount.containsKey(a)) {

                        wordsCount.put(a, wordsCount.get(a) + 1);


                    } else {

                        wordsCount.put(a, 1);
                    }


                }


            }

        }



        List list = new ArrayList<>(wordsCount.entrySet());

        return getTop5(list);


    }

    public static List getTop5(List list) {

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });



        List newList = new ArrayList();

        for (int i = 0; i < 5; i++) {
            newList.add(list.get(i));
        }

        return newList;
    }



}
