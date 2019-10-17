package table.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic hash table class.
 * @param <T> The value type of the values within our key-value pairs.
 */
public class GHashTable<T> {
    
    private ArrayList<GHashNode<T>> nodes;

    /**
     * Constructor.
     */
    public GHashTable() {
        this.nodes = new ArrayList<GHashNode<T>>();
    }

    /**
     * Add a value to this hash table.
     */
    public void addValue(T value) {
        var key = value.toString().hashCode();
        boolean found = false;
        for (var node : this.nodes) {
            if (node.getKey().equals(key)) {
                node.addValue(value);
                found = true;
                break;
            }
        }
        if (!found) {
            var node = new GHashNode<T>(key);
            node.addValue(value);
            this.nodes.add(node);
        }
    }

    /**
     * Get all values associated with this key value.
     * @param key The key to get values for.
     * @return The values if the key was found, otherwise null.
     */
    public List<T> getValue(Integer key) {
        List<T> values = null;
        for (var node : this.nodes) {
            if (node.getKey().equals(key)) {
                values = node.getValues();
                break;
            }
        }
        return values;
    }

    /**
     * Return the size of the hash table.
     */
    public Integer size() {
        return this.nodes.size();
    }
}
