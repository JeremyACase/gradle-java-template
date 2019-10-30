package sort;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

/**
 * Test suite for our quick sort class.
 */
public class QuickSortTest {

    /**
     * Assert that our quick sort works as intended.
     */
    @Test
    public void testQuickSortIsValid1() {
        var list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        var quickSort = new QuickSort();
        quickSort.sort(list);
        var valid = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                valid = false;
            }
        }
        org.junit.Assert.assertTrue(valid);
    }

    /**
     * Assert that our quick sort works as intended.
     */
    @Test
    public void testQuickSortIsValid2() {
        var list = new ArrayList<Integer>();
        list.add(-5);
        list.add(400);
        list.add(0);
        list.add(-25);
        list.add(1);
        list.add(1);
        list.add(1);
        var quickSort = new QuickSort();
        quickSort.sort(list);
        var valid = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                valid = false;
            }
        }
        org.junit.Assert.assertTrue(valid);
    }

    /**
     * Assert that our quick sort works as intended.
     */
    @Test
    public void testQuickSortIsValid3() {
        var list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(9);
        var quickSort = new QuickSort();
        quickSort.sort(list);
        var valid = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                valid = false;
            }
        }
        org.junit.Assert.assertTrue(valid);
    }

    /**
     * Assert that our implementation handles empty lists.
     */
    @Test
    public void testQuickSortHandlesEmptyIsValid() {
        var list = new ArrayList<Integer>();
        var quickSort = new QuickSort();
        quickSort.sort(list);

        // Let's assume if we made it here, we did so without error in 
        // Quicksort.
        org.junit.Assert.assertTrue(true);
    }

    /**
     * Assert that our list can handle huge, randomized lists.
     */
    @Test
    public void testRandomHugeListIsValid() {
        var size = 2500;
        var rand = new Random();
        var list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            var value = rand.nextInt(100000);
            list.add(value);
        }
        var quickSort = new QuickSort();
        quickSort.sort(list);

        var valid = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                valid = false;
            }
        }
        org.junit.Assert.assertTrue(valid);
    }
}
