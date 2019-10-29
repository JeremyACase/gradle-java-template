package sort;

import java.util.List;

/**
 * Sort interface - for all your sorting needs.
 * @param <T> The type of item we're sorting.
 */
public interface ISort<T> {

    /**
     * Sort a list of Type T.
     * @param toSort The list to sort. 
     * @return A sorted list of type T.
     */
    public List<T> sort(List<T> toSort);

}