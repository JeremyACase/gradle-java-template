package table.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic hash node for use within a generic Hash Table.
 */
public class GHashNode<T> {

    private Integer key;

    private ArrayList<T> values;

    /**
     * Constructor.
     * @param key The key value to initialize this node to.
     */
    public GHashNode(Integer key) {
        this.key = key;
        this.values = new ArrayList<>();
    }

    /**
     * Add a value to this node.
     * @param value The value to add.
     */
    public void addValue(T value) {
        this.values.add(value);
    }

    /**
     * Add a list of values to this node.
     * @param values The values to add.
     */
    public void addValues(ArrayList<T> values) {
        for (T value : values) {
            this.values.add(value);
        }
    }

    /**
     * Clear this node's values.
     */
    public void clear() {
        this.values.clear();
    }

    /**
     * Get a copy of this node's key.
     */
    public Integer getKey() {
        return this.key;
    }

    /**
     * Return a copy of this node's values.
     * @return A copy of this node's internal values.
     */
    public List<T> getValues() {
        List<T> values = new ArrayList<>(this.values);
        return values;
    }

    /**
     * Remove a value from this node's list of values.
     * @param value The value to remove.
     */
    public void remove(T value) {
        this.values.remove(value);
    }

}