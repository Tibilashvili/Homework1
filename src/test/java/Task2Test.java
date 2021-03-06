import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class Task2Test extends TestCase {

    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    ArrayList arrayList3 = new ArrayList();
    ArrayList arrayList4 = new ArrayList();
    ArrayList arrayList5 = new ArrayList();
    ArrayList arrayList6 = new ArrayList();
    ArrayList arrayList7 = new ArrayList();
    List<String> expectedList = new ArrayList<>();


    @Before
    protected void setUp() {
        arrayList1.add("we have null");
        arrayList2.add("Слов с хештегами нет");
        arrayList3.add("Привет, друзья");
        arrayList4.add("#Харьков - лучший город!");


    }






    @Test
    public void testReadFile() {
        expectedList.add("#Киев - первый по численности населения #город Украины. #Киев - столица нашей страны. #Киев имеет очень много достопримечательностей. Обязательно посетите #Крещатик. В Киеве есть прекрасная #набережная. В Киеве #река #Днепр делит город на две части. Приезжайте в #Киев и не пожалеете!");
        expectedList.add("#Харьков - второй по численности населения #город Украины. Через город протекает одноимённая #река. Здесь есть на что посмотреть. Детей можно сводить в новые #зоопарк и #аквапарк. В нашем городе есть на что посмотреть. #Зеркальная струя вас порадует. Приезжайте в #Харьков и не пожалеете!");
        expectedList.add("#Одесса - третий по численности #город Украины. В Одессе есть прекрасное #море. Здесь есть великолепная #набережная. #Центр города никого не оставит равнодушным. Великолепная набережная вас порадует. Приезжайте в славный город #Одесса и не пожалеете!");
        expectedList.add("#Днепр - четвёртый по численности #город Украины. Через город протекает одноимённая #река. Красивая #набережная является украшением города. Приезжайте в славный город #Днепр и не пожалеете!");
        expectedList.add("#В нашей стране много хороших городов, но самый лучший - #Харьков!");
        List<String> emptyList = new ArrayList<>();
        List<String> result = Task2.readFromFile(emptyList);
        assertEquals(expectedList, result);

    }


    @Test
    public void testHashtag() {

        TreeMap<String, Integer> expectedMap = new TreeMap();
        expectedMap.put("#город", 4);
        expectedMap.put("#набережная", 3);
        expectedMap.put("#река", 3);
        expectedMap.put("#Днепр", 2);
        expectedMap.put("#Харьков", 2);


        List expectedList = new ArrayList<>(expectedMap.entrySet());

        Collections.sort(expectedList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List fileList = new ArrayList<>();
        fileList.add("#Киев - первый по численности населения #город Украины. #Киев - столица нашей страны. #Киев имеет очень много достопримечательностей. Обязательно посетите #Крещатик. В Киеве есть прекрасная #набережная. В Киеве #река #Днепр делит город на две части. Приезжайте в #Киев и не пожалеете!");
        fileList.add("#Харьков - второй по численности населения #город Украины. Через город протекает одноимённая #река. Здесь есть на что посмотреть. Детей можно сводить в новые #зоопарк и #аквапарк. В нашем городе есть на что посмотреть. #Зеркальная струя вас порадует. Приезжайте в #Харьков и не пожалеете!");
        fileList.add("#Одесса - третий по численности #город Украины. В Одессе есть прекрасное #море. Здесь есть великолепная #набережная. #Центр города никого не оставит равнодушным. Великолепная набережная вас порадует. Приезжайте в славный город #Одесса и не пожалеете!");
        fileList.add("#Днепр - четвёртый по численности #город Украины. Через город протекает одноимённая #река. Красивая #набережная является украшением города. Приезжайте в славный город #Днепр и не пожалеете!");
        fileList.add("#В нашей стране много хороших городов, но самый лучший - #Харьков!");


        List result = Task2.hashtag(fileList);

        assertEquals(expectedList, result);
    }

    @Test
    public void testHashtag2() {
        assertEquals(arrayList1, Task2.hashtag(null));
    }

    @Test
    public void testHashtag3() {
        assertEquals(arrayList2, Task2.hashtag(arrayList3));
    }


    @Test
    public void testHashtag4() {
        arrayList5.add("#Харьков=1");
        assertEquals(arrayList5.toString(), Task2.hashtag(arrayList4).toString());
    }




}
