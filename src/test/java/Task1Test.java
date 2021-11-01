import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task1Test extends TestCase {

    @Test
    public void testBubbleSort() {
        int myArray [] = {-67, -700, -1, 24, 0, 78, 11, 2};
        int trueResult [] =  {78, 24, 11, 2, 0, -1, -67, -700};
       assertArrayEquals(trueResult, Task1.bubbleSort(myArray));

    }

     @Test
     public void testSortArray() {
      int myArray [] = {-67, -700, -1, 24, 0, 78, 11, 2};
      int trueResult [] = {78, 24, 11, 2};
      assertArrayEquals(trueResult, Task1.sortArray(myArray)); }



    }




