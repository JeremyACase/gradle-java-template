package sort;

import java.util.List;

/**
 * A class maintaining the necessary functions to sort a list.
 */
public class QuickSort implements ISort<Integer> {

    /**
     * Quicksort implementation of sort.
     * @param toSort The list to sort.
     * @return A sorted list of integers.
     */
    public List<Integer> sort(List<Integer> toSort) {
        if (toSort.size() > 1) {
            this.quickSort(toSort, 0, toSort.size() - 1);
        }
        return toSort;
    }

    /**
     * Given a sortable list, parition (get a pivot for) the quick sort algorithm.
     * @param list The list to sort.
     * @return The pivot point to use.
     */
    private Integer partition(List<Integer> list, final Integer low, final Integer high) {
        var pivot = list.get(high);
        var i = low - 1;
        for (Integer j = low; j <= high; j++) {
            if (list.get(j) < pivot) {
                i++;
                var placeHolder = list.get(i);
                System.out.println(placeHolder + " -> " + list.get(j));
                list.set(i, list.get(j));
                list.set(j, placeHolder);
            }
        }
        var placeHolder = list.get(i  + 1);
        System.out.println(placeHolder + " -> " + list.get(high));
        list.set(i + 1, list.get(high));
        list.set(high, placeHolder);
        return i + 1;
    }

    /**
     * Quick sort a list.
     * @param toSort The list to sort. 
     * @param low The "low" index.
     * @param high The "high" index.
     */
    private void quickSort(List<Integer> toSort, final Integer low, final Integer high) {
        if (low < high) {
            var partition = this.partition(toSort, low, high);
            this.quickSort(toSort, low, partition - 1);
            this.quickSort(toSort, partition + 1, high);
        }
    }
}
