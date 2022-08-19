package binarysearchdriver;

import org.junit.Test;
import static org.junit.Assert.*;

public class binarySearchJUnitTest {

    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        int[] randomNumbers = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};
        int expResult = 0;
        int result = BinarySearch.binarySearch(randomNumbers, 0, 9, 1);
        assertEquals(expResult, result);
    }
}