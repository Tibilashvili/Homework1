import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class Task1Test extends TestCase {

    ArrayList<String> arrayList1 = new ArrayList<String>();
    int myArray [] = {-67, -700, -1, 24, 0, 78, 11, 2};

    @Before
    protected void setUp() {
        arrayList1.add("we have null");
    }


    @Test
    public void testBubbleSort() {
        int trueResult [] =  {78, 24, 11, 2, 0, -1, -67, -700};
       assertArrayEquals(trueResult, Task1.bubbleSort(myArray));

    }

     @Test
     public void testSortArray() {
      int trueResult [] = {78, 24, 11, 2};
      assertArrayEquals(trueResult, Task1.sortArray(myArray)); }


    @Test
    public void testArrayListBubbleSort() {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        assertEquals(arrayList1, Task1.arrayListBubbleSort(arrayList2));
    }


    @Test
    public void testArrayListBubbleSort2() {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(5);
        arrayList2.add(null);
        assertEquals(arrayList1, Task1.arrayListBubbleSort(arrayList2));
    }


    @Test
    public void testArrayListBubbleSort3() {
        assertEquals(arrayList1, Task1.arrayListBubbleSort(null));
    }



    }




